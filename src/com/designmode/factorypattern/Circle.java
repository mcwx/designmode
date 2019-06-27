package com.designmode.factorypattern;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-27
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
