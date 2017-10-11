package com.gezi.writetoexcel.util;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class SaveToExcel {
    private WritableWorkbook wwb;
    private String excelPath;
    private File excelFile;
    private Activity activity;

    public SaveToExcel(Activity activity, String excelPath) {
        this.excelPath = excelPath;
        this.activity = activity;
        excelFile = new File(excelPath);
        createExcel(excelFile);

    }

    // 创建excel表.
    public void createExcel(File file) {
        WritableSheet ws = null;
        try {
            if (!file.exists()) {
                wwb = Workbook.createWorkbook(file);

                ws = wwb.createSheet("sheet1", 0);

                // 在指定单元格插入数据
                Label lbl1 = new Label(0, 0, "品牌");
                Label lbl2 = new Label(1, 0, "名称");
                Label lbl3 = new Label(2, 0, "规格");
                Label lbl4 = new Label(3, 0, "价格");
                Label lbl5 = new Label(4, 0, "单位");

                ws.addCell(lbl1);
                ws.addCell(lbl2);
                ws.addCell(lbl3);
                ws.addCell(lbl4);
                ws.addCell(lbl5);

                // 从内存中写入文件中
                wwb.write();
                wwb.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToExcel(Object... args) {

        try {
            Workbook oldWwb = Workbook.getWorkbook(excelFile);
            wwb = Workbook.createWorkbook(excelFile, oldWwb);
            WritableSheet ws = wwb.getSheet(0);
            // 当前行数
            int row = ws.getRows();
            Label lab1 = new Label(0, row, args[0] + "");
            Label lab2 = new Label(1, row, args[1] + "");
            Label lab3 = new Label(2, row, args[2] + "");
            Label lab4 = new Label(3, row, args[3] + "");
            Label lab5 = new Label(4, row, args[4] + "");
            ws.addCell(lab1);
            ws.addCell(lab2);
            ws.addCell(lab3);
            ws.addCell(lab4);
            ws.addCell(lab5);

            // 从内存中写入文件中,只能刷一次.
            wwb.write();
            wwb.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
