package com.cc.course.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by chenchao on 2019/7/2.
 */
public class MeiPo implements MethodInterceptor {

    public Object getInstance(Object object){
        Enhancer enhancer = new Enhancer();
        //��һ�����Ǹ���cgLib�����ɵ�������Ҫ�̳��ĸ���
        enhancer.setSuperclass(object.getClass());
        //���ûص�
        enhancer.setCallback(this);
        //��һ�� ����Դ����  �ڶ��� �����class�ļ�  �������� ���ص�jvm�� ���ɲ����ر��������
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("����ý��,��Ҫ������һ�����Բ���");
        System.out.println("��ʼ��ѡ");
        //���obj����������cglib������new������
        //cglib new �����Ժ�Ķ����Ǳ������������ࣨ�̳��������Լ�д���ĸ��ࣩ
        //new �������ͬʱ��������new�������࣬���൱�ڼ�ӵĳ��������Ǹ��������
        //������д�˸������еķ���
        //����
        //
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
