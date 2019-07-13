package com.cc.course.factory.func;

import com.cc.course.factory.Bmw;
import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */
public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
