package com.designmode.singletonpattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-07-03
 */
public class Demo0SingletonPattern {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误，构造函数SingleObject()是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
