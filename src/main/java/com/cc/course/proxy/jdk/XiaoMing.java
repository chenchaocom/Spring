package com.cc.course.proxy.jdk;

/**
 * Created by chenchao on 2019/7/2.
 */
public class XiaoMing implements Person {

    private String name = "С��";
    private String sex = "Ů";

    public void findLove() {


        System.out.println("�ҽ�"+name+",�Ա�"+sex+"���Ҷ����Ҫ����");
        System.out.println("�߸�˧");
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
