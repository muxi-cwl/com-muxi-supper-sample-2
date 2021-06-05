package com.muxi.sample.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author muxi
 * @Date 2021/6/5
 * @Description
 **/

//@Aspect
//@Order(100000)
//@Component
public class MyAspect {

    @Pointcut("@annotation(myAnnotation)")
    public void choose(MyAnnotation myAnnotation){

    }


    @Around("choose(myAnnotation)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint,MyAnnotation myAnnotation) throws Throwable {
        System.out.println(myAnnotation.value());
        System.out.println("===========>>>>>>>>>> 这里是环绕通知");
        return proceedingJoinPoint.proceed();
    }
}
