package com.designmode.factorypattern.demo1;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class LogRecorderFactory {

    public LogRecorder getLogRecorder(String recorderType) {
        if (recorderType == null) {
            return null;
        }
        if (recorderType.equalsIgnoreCase("LocalDisk")) {
            return new LocalDiskLog();
        } else if (recorderType.equalsIgnoreCase("OSS")) {
            return new OssLog();
        }
        return null;
    }
}
