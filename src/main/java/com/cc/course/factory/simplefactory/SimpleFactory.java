package com.cc.course.factory.simplefactory;

import com.cc.course.factory.Benz;
import com.cc.course.factory.Bmw;
import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */
//对于这个工厂来说，啥都能干 既能产宝马，也能奔驰，不符合现实
public class SimpleFactory {
    //实现统一管理  专业化管理
    //如果没有工厂模式  自产自销 没有执行标准
    //如果没有标准
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else{
            return null;
        }
    }
}
