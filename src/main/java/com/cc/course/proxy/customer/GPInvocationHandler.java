package com.cc.course.proxy.customer;

import java.lang.reflect.Method;

/**
 * Created by chenchao on 2019/7/2.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
