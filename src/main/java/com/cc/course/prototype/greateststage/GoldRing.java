package com.cc.course.prototype.greateststage;

import java.io.Serializable;

/**
 * Created by chenchao on 2019/7/6.
 */
public class GoldRing implements Serializable {

    private float height = 40;
    //Ö±¾¶

    private float diameter = 40;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
