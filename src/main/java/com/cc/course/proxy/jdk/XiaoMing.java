package com.cc.course.proxy.jdk;

/**
 * Created by chenchao on 2019/7/2.
 */
public class XiaoMing implements Person {

    private String name = "小明";
    private String sex = "女";

    public void findLove() {


        System.out.println("我叫"+name+",性别"+sex+"我找对象的要求是");
        System.out.println("高富帅");
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
