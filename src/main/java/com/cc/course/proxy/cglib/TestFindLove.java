package com.cc.course.proxy.cglib;

import com.cc.course.proxy.jdk.*;
import com.cc.course.proxy.jdk.XiaoMing;

/**
 * Created by chenchao on 2019/7/2.
 */
public class TestFindLove {
    public static void main(String[] args) {
       XiaoMing xiaoMing = (XiaoMing) new MeiPo().getInstance(new XiaoMing());

        xiaoMing.findLove();
    }
}
