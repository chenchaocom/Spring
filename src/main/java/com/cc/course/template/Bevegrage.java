package com.cc.course.template;

/**
 * Created by chenchao on 2019/7/6.
 */
public abstract class Bevegrage {

    public final  void create(){
        //把水烧好
        boilWater();
        //把被子准备好，把原料放进去
        pourInCup();
        //用水冲泡
        brew();
        //加作料
        add();

    }

    public void boilWater(){
        System.out.println("把水烧好");
    }

    public abstract void pourInCup();


    public void brew(){
        System.out.println("用水冲泡");
    }

    public abstract void add();

}
