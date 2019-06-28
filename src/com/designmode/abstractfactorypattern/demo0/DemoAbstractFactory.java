package com.designmode.abstractfactorypattern.demo0;

/**
 * @Description:
 * @Auther: houpeng
 * @Date: 2019-06-28
 */
public class DemoAbstractFactory {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为circle的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用Circle的draw方法
        shape1.daraw();

        //获取形状为rectangle的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用rectangle的draw方法
        shape2.daraw();

        //获取形状为square的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用square的draw方法
        shape3.daraw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取样色为red的对象
        Color color1 = colorFactory.getColor("RED");

        //调用red的fill方法
        color1.fill();

        //获取样色为green的对象
        Color color2 = colorFactory.getColor("GREEN");

        //调用green的fill方法
        color2.fill();

        //获取样色为blue的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用blue的fill方法
        color3.fill();
    }
}
