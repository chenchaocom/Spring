package com.cc.course.proxy.customer;

import java.lang.reflect.InvocationHandler;

/**
 * Created by chenchao on 2019/7/2.
 */
//生成代理对象的代码
public class GPProxy {
    private static String ln = "\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,

                                          GPInvocationHandler h) throws IllegalArgumentException{
        //生成源代码
        String proxySrc = generateSrc(interfaces);
        //将生成的源代码输出到磁盘，保存为java文件

        //编译源代码  并且生成class 文件

        //将class文件里面的内容 动态加载到jvm中来

        //返回被代理后后代理对象
        return null;
    }

    private static String generateSrc(Class<?>[]interfaces){
        StringBuffer src = new StringBuffer();
        src.append("package com.cc.course.proxy.customer");
        return  "";
    }
}
