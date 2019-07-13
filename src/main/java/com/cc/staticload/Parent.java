package com.cc.staticload;

/**
 * Created by chenchao on 2019/7/5.
 */
public class Parent {
    //静态变量
    private static String p_staticField = "父类静态变量";

    public  String p_Field = "父类变量";

    static{
        System.out.println("父类--静态初始化块");
        System.out.println(p_staticField);
    }

    {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }
    public Parent(){
        System.out.println("父类--构造函数");
    }



}

 class subClass extends Parent{
    //静态变量
    private static String p_staticField = "子类静态变量";

    public String p_Field = "子类变量";

    static{
        System.out.println(p_staticField);
        System.out.println("子类--静态初始化块");
     //   print();

    }

    {
        System.out.println(p_Field);
        System.out.println("子类--初始化块");
    }
    public subClass(){
        System.out.println("子类--构造函数");
    }

    public static  void print(){
        System.out.println("我是普通方法");
    }
     public static void main(String[] args) {
       subClass s1 =  new subClass();
         System.out.println("----------");
         new subClass();
     }
}




