package com.designmode.factorypattern.demo1;

/**
 * @Description:记录日志到OSS系统
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class OssLog implements LogRecorder {
    @Override
    public void writeLog() {
        System.out.println("Write log to OSS！");
    }
}
