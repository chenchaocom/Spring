package com.cc.staticload;

/**
 * Created by chenchao on 2019/7/5.
 */
public class Parent {
    //��̬����
    private static String p_staticField = "���ྲ̬����";

    public  String p_Field = "�������";

    static{
        System.out.println("����--��̬��ʼ����");
        System.out.println(p_staticField);
    }

    {
        System.out.println(p_Field);
        System.out.println("����--��ʼ����");
    }
    public Parent(){
        System.out.println("����--���캯��");
    }



}

 class subClass extends Parent{
    //��̬����
    private static String p_staticField = "���ྲ̬����";

    public String p_Field = "�������";

    static{
        System.out.println(p_staticField);
        System.out.println("����--��̬��ʼ����");
     //   print();

    }

    {
        System.out.println(p_Field);
        System.out.println("����--��ʼ����");
    }
    public subClass(){
        System.out.println("����--���캯��");
    }

    public static  void print(){
        System.out.println("������ͨ����");
    }
     public static void main(String[] args) {
       subClass s1 =  new subClass();
         System.out.println("----------");
         new subClass();
     }
}




