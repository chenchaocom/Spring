package com.cc.course.delegate;

/**
 * Created by chenchao on 2019/7/4.
 */
public class TestDispatch {
    public static void main(String[] args) {
        Dispatch dispatch = new Dispatch(new ExectorB());
        //������ǵ��͵ĸɻ����ҵģ����������
        dispatch.doing();
    }
}
