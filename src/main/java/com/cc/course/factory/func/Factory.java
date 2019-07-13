package com.cc.course.factory.func;

import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */

//这个工厂是接口 就定义了所有工厂执行的标准
public interface Factory {
    //符合汽车上路的标准
    //尾气排放标准
    //必须配备安全带
    Car getCar();

}
