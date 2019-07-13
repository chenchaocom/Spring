package com.cc.course.factory.abstr;

import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/3.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();

        Car benz = defaultFactory.getCar("BMW");
        System.out.println(benz.getName());
    }
}
