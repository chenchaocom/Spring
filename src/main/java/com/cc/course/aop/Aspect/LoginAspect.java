package com.cc.course.aop.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by chenchao on 2019/7/13.
 */
public class LoginAspect {

    private final static Logger logger = Logger.getLogger(LoginAspect.class);


    public void before(JoinPoint joinPoint){
        logger.info("���÷���֮ǰ����"+ joinPoint);
    }


    public void afterReturn(JoinPoint joinPoint){
        logger.info("���÷�������֮ǰ����"+joinPoint);
    }

    public void after(JoinPoint joinPoint){
        logger.info("����֮��ִ��"+joinPoint);
    }

    public void afterThrow(JoinPoint joinPoint){
        logger.info("�׳��쳣֮��ִ��"+ joinPoint);
    }


}
