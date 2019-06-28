package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}