package com.cc.course.factory.func;

/**
 * Created by chenchao on 2019/7/2.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //��������ģʽ  ������Ʒ�������̶��и��ԵĹ���
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());

        factory = new BmwFactory();
        System.out.println(factory.getCar());

        //���ӵĴ����ʹ�ø��Ӷ�
    }
}
