package com.cc.course.template;

/**
 * Created by chenchao on 2019/7/6.
 */
public abstract class Bevegrage {

    public final  void create(){
        //��ˮ�պ�
        boilWater();
        //�ѱ���׼���ã���ԭ�ϷŽ�ȥ
        pourInCup();
        //��ˮ����
        brew();
        //������
        add();

    }

    public void boilWater(){
        System.out.println("��ˮ�պ�");
    }

    public abstract void pourInCup();


    public void brew(){
        System.out.println("��ˮ����");
    }

    public abstract void add();

}
