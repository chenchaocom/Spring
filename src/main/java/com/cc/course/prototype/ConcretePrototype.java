package com.cc.course.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenchao on 2019/7/6.
 */
public class ConcretePrototype implements Cloneable {

    private String name;
    private int age;
    private ArrayList<String> list = new ArrayList<String>();

    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = null;
        concretePrototype=(ConcretePrototype) super.clone();
    //    concretePrototype.list = (ArrayList)list.clone();
        return concretePrototype;
        //克隆是基于字节码
        //用反射或者循环
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
