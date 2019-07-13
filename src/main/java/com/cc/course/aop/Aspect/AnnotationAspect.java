package com.cc.course.aop.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenchao on 2019/7/13.
 */
@Component //声明这个类是被springioc容器来管理的 如果不声明 就无法做到自动织入
@Aspect// 这个申明是一个需要动态织入到我们虚拟切面中的类
public class AnnotationAspect {
    private final static Logger logger = Logger.getLogger(AnnotationAspect.class);


    @Pointcut("execution(public * com.cc.course.aop.service..*(..))")
    public void pointCutConfig(){}

    @Before(" pointCutConfig()")
    public void before(JoinPoint joinPoint){
        logger.info("调用方法之前调用"+ joinPoint);
    }


    @AfterReturning("pointCutConfig()")
    public void afterReturn(JoinPoint joinPoint){
        logger.info("调用方法返回之前调用"+joinPoint);
    }

    @After( "pointCutConfig()")
    public void after(JoinPoint joinPoint){
        logger.info("调用之后执行"+joinPoint);
    }

    @AfterThrowing("pointCutConfig()")
    public void afterThrow(JoinPoint joinPoint){
        logger.info("抛出异常之后执行"+ joinPoint);
    }


}
