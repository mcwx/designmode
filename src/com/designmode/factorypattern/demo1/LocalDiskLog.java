package com.designmode.factorypattern.demo1;

/**
 * @Description:记录日志到本地磁盘
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class LocalDiskLog implements LogRecorder {
    @Override
    public void writeLog() {
        System.out.println("Write log to local hard disk！");
    }
}
