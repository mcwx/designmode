package com.designmode.factorypattern.demo1;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class LogRecorderDemo {
    public static void main(String[] args) {
        LogRecorderFactory logRecorderFactory = new LogRecorderFactory();

        LogRecorder logRecorder1 = logRecorderFactory.getLogRecorder("LocalDisk");
        logRecorder1.writeLog();

        LogRecorder logRecorder2 = logRecorderFactory.getLogRecorder("OSS");
        logRecorder2.writeLog();
    }
}
