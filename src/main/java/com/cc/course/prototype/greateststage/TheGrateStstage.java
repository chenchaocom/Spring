package com.cc.course.prototype.greateststage;

import java.io.*;
import java.util.Date;

/**
 * Created by chenchao on 2019/7/6.
 */
public class TheGrateStstage extends Monkey implements Cloneable,Serializable {
    private GoldRing goldRing;


    public TheGrateStstage(){
        this.goldRing = new GoldRing();
        this.birthday = new Date();
        this.height=40;
        this.weight = 40;
    }

    public Object clone() throws CloneNotSupportedException {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            TheGrateStstage copy = (TheGrateStstage) ois.readObject();
            return copy;


        }catch (Exception e){
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
     //  return super.clone(); 默认是浅克隆
    }

    public void change() throws CloneNotSupportedException {
       TheGrateStstage copySage =  (TheGrateStstage)clone();
       this.setHeight(50);
        this.getGoldRing().setDiameter(50);

        System.out.println(this.getHeight() + " " +this.getGoldRing().getDiameter());

        System.out.println(copySage.getHeight() + " " +copySage.getGoldRing().getDiameter());

//        System.out.println("大圣本尊生日是：" + this.getBirthday().getTime());
//        System.out.println("克隆大圣的生日是:" + copySage.getBirthday().getTime());
//        System.out.println("大圣本尊和克隆大圣是否为同一个对象:" + (this == copySage));
//        System.out.println("大圣本尊持有的金箍棒跟克隆大圣持有金箍棒是否为同一个对象:" + (this.getGoldRing() == copySage.getGoldRing()));


    }


    public GoldRing getGoldRing() {
        return goldRing;
    }

    public void setGoldRing(GoldRing goldRing) {
        this.goldRing = goldRing;
    }
}
