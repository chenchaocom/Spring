package com.cc;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenchao on 2019/7/10.
 */
public class TestHashSet {

    public static void main(String[] args) {
        hashCodeAndEquals();
    }

    public static void hashCodeAndEquals(){
        //第一个 Set集合：
        Set<String> set1 = new java.util.HashSet<String>();
        String str1 = new String("jiaboyan");
        String str2 = new String("jiaboyan");

        System.out.println( str1.hashCode() == str2.hashCode());

        set1.add(str1);
        set1.add(str2);
        System.out.println("长度："+set1.size()+",内容为："+set1);

       // 第二个 Set集合：
        Set<App> set2 = new HashSet<App>();
        App app1 = new App();
        app1.setName("jiaboyan");

        App app2 = new App();
        app2.setName("jiaboyan");

        set2.add(app1);
        set2.add(app2);

        System.out.println(app1.hashCode() == app2.hashCode());

//        System.out.println("长度："+set2.size()+",内容为："+set2);
//
//        //第三个 Set集合：
        Set<App> set3 = new HashSet<App>();
        App app3 = new App();
        app3.setName("jiaboyan");
        set3.add(app3);
        set3.add(app3);
        System.out.println(app3.equals(app3));
        System.out.println( app3==app3);
       // System.out.println("长度："+set3.size()+",内容为："+set3);
    }


}
class  App{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
