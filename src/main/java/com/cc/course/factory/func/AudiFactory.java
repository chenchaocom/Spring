package com.cc.course.factory.func;

import com.cc.course.factory.Audi;
import com.cc.course.factory.Car;
import com.cc.course.factory.func.Factory;

/**
 * Created by chenchao on 2019/7/2.
 */
public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
