package com.example.yali.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Yali
 * @date 2020-08-04 22:09:20
 * @description
 **/
@Component
@Aspect
public class AOPConfig {

    @Pointcut(value = "execution(* com.example.yali.aop.*.*(..))")
    public void pointcut(){}

    @Before(value = "pointcut()")
    public void before(){
        System.out.println("before......");
    }

}
