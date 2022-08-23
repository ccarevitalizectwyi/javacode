package com.xuanxie.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterClass implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue,
                               Method method, Object[] args,
                               Object target) throws Throwable
    {
        System.out.println(method.getName()+"方法执行完毕,结果为 "+returnValue);
    }
}