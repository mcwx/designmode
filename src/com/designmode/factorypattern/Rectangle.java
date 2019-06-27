package com.designmode.factorypattern;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-27
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
