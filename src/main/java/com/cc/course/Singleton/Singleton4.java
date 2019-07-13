package com.cc.course.Singleton;

/**
 * Created by chenchao on 2019/7/6.
 */
public class Singleton4 {

    //1 先声明一个静态内部类
    //2 private 保证别人不能被修改
    //3 static 保证全局唯一

    private  static class LazyHolder{
        private static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){};

    //同样提供一个静态方法去获取实例，final保证不能被修改
    private static final Singleton4 getInstance(){

        return LazyHolder.singleton4;
    }

}
