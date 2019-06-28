package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class Circle implements Shape {
    @Override
    public void daraw() {
        System.out.println("Inside Circle::draw() method.");
    }
}