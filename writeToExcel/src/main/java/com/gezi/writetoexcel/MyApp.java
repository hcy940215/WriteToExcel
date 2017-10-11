package com.gezi.writetoexcel;

import android.app.Application;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description:
 * created at 2017/3/1 14:35
 *
 * @author: 黄昌友
 */

public class MyApp extends Application {
    private InternetService service;
    String BASEURL = "http://shop.api.haocaisong.cn/";

    @Override
    public void onCreate() {
        super.onCreate();
        //第一版接口前缀 https://app.mingpinjiancai.com/
        //第二版接口前缀 https://app.mingpinjiancai.com/v1/
        service = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build()
                .create(InternetService.class);

    }

    public InternetService getService() {
        return service;
    }

}
