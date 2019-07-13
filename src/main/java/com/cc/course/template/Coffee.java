package com.cc.course.template;

/**
 * Created by chenchao on 2019/7/6.
 */
public class Coffee extends Bevegrage {
    @Override
    public void pourInCup() {
        System.out.println("加入咖啡原料");
    }

    @Override
    public void add() {
        System.out.println("加糖和牛奶");
    }
}
