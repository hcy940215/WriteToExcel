package com.gezi.writetoexcel;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.gezi.writetoexcel.util.SaveToExcel;

import java.io.File;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import jxl.write.Label;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.gezi.writetoexcel.util.GetDir.getExcelDir;

public class MainActivity extends AppCompatActivity implements Callback<Entity<Haocai>> {
    private String excelPath;
    private SaveToExcel saveToExcel;

    int page = 0;
    private static final int MY_PERMISSIONS_REQUEST = 1;
    private List<Haocai.ListBean> list;
    private boolean has_more;
    private int[] ints;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        excelPath = getExcelDir() + File.separator + "好材油类商品信息.xls";
        saveToExcel = new SaveToExcel(this, excelPath);
       // ints = new int[]{301,302,303,304,305,307,308,309,310};
       // ints = new int[]{401,402,403,404,405,406,407};
       /// ints = new int[]{501,502,505,507,508,510,511};
        ints = new int[]{601,602};

        ((MyApp) getApplication()).getService().getData(6, ints[0], page).enqueue(this);
    }


    @OnClick({R.id.save, R.id.page, R.id.cate})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_REQUEST);
                } else {
                    if (list.size() > 0) {
                        for (int i = 0; i < list.size(); i++) {
                            Haocai.ListBean listBean = list.get(i);
                            saveToExcel.writeToExcel(listBean.getBrand(),
                                    listBean.getTitle(),
                                    listBean.get_model(),
                                    listBean.getSale_price(),
                                    listBean.getUnit());
                        }
                        Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
                        if (has_more) {
                            ++page;
                            Toast.makeText(this, "第>> " + page + " <<页", Toast.LENGTH_SHORT).show();
                            ((MyApp) getApplication()).getService().getData(1, ints[count], page).enqueue(this);

                        }else {
                            Toast.makeText(this, "没有下一页了", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(this, "没数据", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.page:
                if (has_more) {
                    ++page;
                    Toast.makeText(this, "第>> " + page + " <<页", Toast.LENGTH_SHORT).show();
                    ((MyApp) getApplication()).getService().getData(1, ints[count], page).enqueue(this);

                } else {
                    Toast.makeText(this, "没有下一页喽", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cate:
                if (!has_more) {
                    ++count;
                    Toast.makeText(this, "第"+(count+1)+"子类", Toast.LENGTH_SHORT).show();
                    page = 0;
                    ((MyApp) getApplication()).getService().getData(1, ints[count], page).enqueue(this);

                } else {
                    Toast.makeText(this, "上一个子类还没有下载完哦", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == MY_PERMISSIONS_REQUEST) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // saveToExcel.writeToExcel(name, sex, phone, address);
            } else {
                // Permission Denied
                Toast.makeText(MainActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onResponse(Call<Entity<Haocai>> call, Response<Entity<Haocai>> response) {
        Haocai data = response.body().getData();
        has_more = data.isHas_more();
        list = data.getList();
        Log.i("TAG", "onResponse: " + list.size());
    }

    @Override
    public void onFailure(Call<Entity<Haocai>> call, Throwable t) {

    }
}
