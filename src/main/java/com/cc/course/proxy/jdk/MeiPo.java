package com.cc.course.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chenchao on 2019/7/2.
 */
public class MeiPo implements InvocationHandler {

    private Object target;

    public Object getObjectInstance(Object target){
        this.target = target;
        System.out.println("������Ķ�����"+target);
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("����ý��,��Ҫ������һ�����Բ���");
        System.out.println("��ʼ��ѡ");
        method.invoke(target,args);
        return null;
    }
}
