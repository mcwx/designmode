package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
