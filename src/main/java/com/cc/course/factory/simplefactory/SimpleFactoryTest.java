package com.cc.course.factory.simplefactory;

import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //��߾������ǵ�������

        Car car =   new SimpleFactory().getCar("BMW");
        System.out.println(car.getName());
    }
}
