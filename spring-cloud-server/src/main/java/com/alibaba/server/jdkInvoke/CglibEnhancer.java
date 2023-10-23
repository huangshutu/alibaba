package com.alibaba.server.jdkInvoke;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 6:03
 */
public class CglibEnhancer implements MethodInterceptor {
    Object target;
    public CglibEnhancer(Object target){
        this.target = target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB前置通知");
        Object invoke = methodProxy.invoke(target, args);
        System.out.println("CGLIB后置通知");
        return invoke;
    }
}
