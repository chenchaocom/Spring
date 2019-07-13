package com.cc.course.factory.simplefactory;

import com.cc.course.factory.Benz;
import com.cc.course.factory.Bmw;
import com.cc.course.factory.Car;

/**
 * Created by chenchao on 2019/7/2.
 */
//�������������˵��ɶ���ܸ� ���ܲ�����Ҳ�ܱ��ۣ���������ʵ
public class SimpleFactory {
    //ʵ��ͳһ����  רҵ������
    //���û�й���ģʽ  �Բ����� û��ִ�б�׼
    //���û�б�׼
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else{
            return null;
        }
    }
}
