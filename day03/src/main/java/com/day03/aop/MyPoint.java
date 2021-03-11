package com.day03.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// DATE: 2021/3/8-16:47  Happy Every Day
@Aspect
@Component
public class MyPoint {
    @Pointcut("execution(* com.day03.aop..*.*(..))")
    public void point(){}

    @Around("point()")
    public Object arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-------------log------------");
        Object ret = proceedingJoinPoint.proceed();
        return ret;
    }
}
