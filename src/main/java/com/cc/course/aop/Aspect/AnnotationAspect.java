package com.cc.course.aop.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenchao on 2019/7/13.
 */
@Component //����������Ǳ�springioc����������� ��������� ���޷������Զ�֯��
@Aspect// ���������һ����Ҫ��̬֯�뵽�������������е���
public class AnnotationAspect {
    private final static Logger logger = Logger.getLogger(AnnotationAspect.class);


    @Pointcut("execution(public * com.cc.course.aop.service..*(..))")
    public void pointCutConfig(){}

    @Before(" pointCutConfig()")
    public void before(JoinPoint joinPoint){
        logger.info("���÷���֮ǰ����"+ joinPoint);
    }


    @AfterReturning("pointCutConfig()")
    public void afterReturn(JoinPoint joinPoint){
        logger.info("���÷�������֮ǰ����"+joinPoint);
    }

    @After( "pointCutConfig()")
    public void after(JoinPoint joinPoint){
        logger.info("����֮��ִ��"+joinPoint);
    }

    @AfterThrowing("pointCutConfig()")
    public void afterThrow(JoinPoint joinPoint){
        logger.info("�׳��쳣֮��ִ��"+ joinPoint);
    }


}
