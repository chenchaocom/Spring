package com.cc.course.delegate;

/**
 * Created by chenchao on 2019/7/4.
 */
public class ExectorA implements IExector {
    @Override
    public void doing() {
        System.out.println("A正在执行任务");
    }
}
