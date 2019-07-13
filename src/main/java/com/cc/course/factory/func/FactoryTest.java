package com.cc.course.factory.func;

/**
 * Created by chenchao on 2019/7/2.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //工厂方法模式  各个产品的生产商都有各自的工厂
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());

        factory = new BmwFactory();
        System.out.println(factory.getCar());

        //增加的代码的使用复杂度
    }
}
