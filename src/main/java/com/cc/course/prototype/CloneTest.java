package com.cc.course.prototype;

/**
 * Created by chenchao on 2019/7/6.
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype concretePrototype = new ConcretePrototype();

        concretePrototype.setName("张三");
        concretePrototype.setAge(18);
        concretePrototype.getList().add("list");

       ConcretePrototype copy = (ConcretePrototype) concretePrototype.clone();


        concretePrototype.setName("李四");
        concretePrototype.setAge(19);
        concretePrototype.getList().add("list2");

        System.out.println(concretePrototype.getList() == copy.getList());
        System.out.println(copy.getList().size());


    }
}
