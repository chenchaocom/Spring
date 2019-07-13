package com.cc.course.Singleton;

/**
 * Created by chenchao on 2019/7/6.
 */
public class Singleton4 {

    //1 ������һ����̬�ڲ���
    //2 private ��֤���˲��ܱ��޸�
    //3 static ��֤ȫ��Ψһ

    private  static class LazyHolder{
        private static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4(){};

    //ͬ���ṩһ����̬����ȥ��ȡʵ����final��֤���ܱ��޸�
    private static final Singleton4 getInstance(){

        return LazyHolder.singleton4;
    }

}
