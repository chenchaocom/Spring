package com.cc.course.delegate;

/**
 * Created by chenchao on 2019/7/4.
 */
public class Dispatch implements IExector {
//ŒØ≈…»À

    private IExector exector;

    public Dispatch(IExector iExector){
        this.exector = iExector;
    }

    public void doing() {
        exector.doing();
    }
}
