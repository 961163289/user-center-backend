package com.yupi.usercenter.once;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * 导入 Excel 数据
 */
public class ImportExcel {
    /**
     * 读取数据
     */
    public static void main(String[] args) {
        String fileName = "H:\\Desktop\\Java\\user-center\\user-center-backend\\src\\main\\resources\\testExcel.xlsx";
//        readByListener(fileName);
        synchronousRead(fileName);
    }

    /**
     * 监听器读取
     */
    private static void readByListener(String fileName) {
        EasyExcel.read(fileName, XingQiuTableUserInfo.class, new TableListener())
                .sheet().doRead();
    }


    /**
     * 同步读取
     */
    public static void synchronousRead(String fileName) {
        List<XingQiuTableUserInfo> totalDataList =
                EasyExcel.read(fileName).head(XingQiuTableUserInfo.class).sheet().doReadSync();
        for (XingQiuTableUserInfo xingQiuTableUserInfo : totalDataList) {
            System.out.println(xingQiuTableUserInfo);
        }
    }

}
