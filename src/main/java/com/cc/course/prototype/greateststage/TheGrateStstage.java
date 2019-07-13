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
            //���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //�����л�
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
     //  return super.clone(); Ĭ����ǳ��¡
    }

    public void change() throws CloneNotSupportedException {
       TheGrateStstage copySage =  (TheGrateStstage)clone();
       this.setHeight(50);
        this.getGoldRing().setDiameter(50);

        System.out.println(this.getHeight() + " " +this.getGoldRing().getDiameter());

        System.out.println(copySage.getHeight() + " " +copySage.getGoldRing().getDiameter());

//        System.out.println("��ʥ���������ǣ�" + this.getBirthday().getTime());
//        System.out.println("��¡��ʥ��������:" + copySage.getBirthday().getTime());
//        System.out.println("��ʥ����Ϳ�¡��ʥ�Ƿ�Ϊͬһ������:" + (this == copySage));
//        System.out.println("��ʥ������еĽ𹿰�����¡��ʥ���н𹿰��Ƿ�Ϊͬһ������:" + (this.getGoldRing() == copySage.getGoldRing()));


    }


    public GoldRing getGoldRing() {
        return goldRing;
    }

    public void setGoldRing(GoldRing goldRing) {
        this.goldRing = goldRing;
    }
}
