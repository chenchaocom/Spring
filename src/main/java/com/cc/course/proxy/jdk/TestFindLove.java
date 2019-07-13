package com.cc.course.proxy.jdk;

import com.cc.course.proxy.customer.GPMeiPo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by chenchao on 2019/7/2.
 */
public class TestFindLove {
    public static void main(String[] args) throws IOException {
//      Person person =(Person) new MeiPo().getObjectInstance(new XiaoMing());
//        System.out.println(person.getClass());
//        person.findLove();
//        byte[] data = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{Person.class});
//        FileOutputStream os = new FileOutputStream("$Proxy0.class");
//        os.write(data);
//        os.close();

        Person person =(Person) new MeiPo().getObjectInstance(new XiaoMing());
        System.out.println(person.getClass());
        person.findLove();

    }
}
