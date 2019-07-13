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
        //��һ�� Set���ϣ�
        Set<String> set1 = new java.util.HashSet<String>();
        String str1 = new String("jiaboyan");
        String str2 = new String("jiaboyan");

        System.out.println( str1.hashCode() == str2.hashCode());

        set1.add(str1);
        set1.add(str2);
        System.out.println("���ȣ�"+set1.size()+",����Ϊ��"+set1);

       // �ڶ��� Set���ϣ�
        Set<App> set2 = new HashSet<App>();
        App app1 = new App();
        app1.setName("jiaboyan");

        App app2 = new App();
        app2.setName("jiaboyan");

        set2.add(app1);
        set2.add(app2);

        System.out.println(app1.hashCode() == app2.hashCode());

//        System.out.println("���ȣ�"+set2.size()+",����Ϊ��"+set2);
//
//        //������ Set���ϣ�
        Set<App> set3 = new HashSet<App>();
        App app3 = new App();
        app3.setName("jiaboyan");
        set3.add(app3);
        set3.add(app3);
        System.out.println(app3.equals(app3));
        System.out.println( app3==app3);
       // System.out.println("���ȣ�"+set3.size()+",����Ϊ��"+set3);
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
