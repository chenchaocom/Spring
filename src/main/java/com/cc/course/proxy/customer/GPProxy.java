package com.cc.course.proxy.customer;

import java.lang.reflect.InvocationHandler;

/**
 * Created by chenchao on 2019/7/2.
 */
//���ɴ������Ĵ���
public class GPProxy {
    private static String ln = "\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,

                                          GPInvocationHandler h) throws IllegalArgumentException{
        //����Դ����
        String proxySrc = generateSrc(interfaces);
        //�����ɵ�Դ������������̣�����Ϊjava�ļ�

        //����Դ����  ��������class �ļ�

        //��class�ļ���������� ��̬���ص�jvm����

        //���ر�������������
        return null;
    }

    private static String generateSrc(Class<?>[]interfaces){
        StringBuffer src = new StringBuffer();
        src.append("package com.cc.course.proxy.customer");
        return  "";
    }
}
