package com.cc.course.factory.abstr;

import com.cc.course.factory.Benz;
import com.cc.course.factory.Car;
import com.cc.course.factory.func.Factory;

/**
 * Created by chenchao on 2019/7/2.
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
