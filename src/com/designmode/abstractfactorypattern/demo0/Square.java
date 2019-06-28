package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class Square implements Shape {
    @Override
    public void daraw() {
        System.out.println("Inside Square::draw() method.");
    }
}
