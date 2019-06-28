package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}