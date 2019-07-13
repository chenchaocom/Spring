package com.cc.course.factory.abstr;

import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/3.
 */
public class DefaultFactory extends AbstractFactory {

    private AudiFactory defaultFactory = new AudiFactory();
    @Override
    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
