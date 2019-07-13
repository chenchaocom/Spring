package com.cc.course.factory.abstr;

import com.cc.course.factory.Benz;
import com.cc.course.factory.Bmw;
import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */
public abstract class AbstractFactory {

   protected abstract  Car getCar();

    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else{
            return null;
        }
    }
}
