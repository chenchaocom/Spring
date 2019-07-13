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
        //这一步就是告诉cgLib，生成的子类需要继承哪个类
        enhancer.setSuperclass(object.getClass());
        //设置回调
        enhancer.setCallback(this);
        //第一步 生成源代码  第二部 编译成class文件  第三部步 加载到jvm中 生成并返回被代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是媒婆,我要给你找一个异性才行");
        System.out.println("开始海选");
        //这个obj的引用是由cglib给我们new出来的
        //cglib new 出来以后的对象，是被代理对象的子类（继承了我们自己写的哪个类）
        //new 了子类的同时，必须先new出来父类，这相当于间接的持有了我们父类的引用
        //子类重写了父类所有的方法
        //我们
        //
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
