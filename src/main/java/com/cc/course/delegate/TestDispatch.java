package com.cc.course.delegate;

/**
 * Created by chenchao on 2019/7/4.
 */
public class TestDispatch {
    public static void main(String[] args) {
        Dispatch dispatch = new Dispatch(new ExectorB());
        //这个就是典型的干活是我的，功劳是你的
        dispatch.doing();
    }
}
