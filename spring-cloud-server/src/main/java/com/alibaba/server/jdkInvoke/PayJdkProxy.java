package com.example.order.jdkInvoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 5:01
 */
public class PayJdkProxy implements InvocationHandler {
    private final Object target;
    public PayJdkProxy(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("前置通知");
        try {
            Object result = method.invoke(target, args);
            System.out.println("后置通知");
            return result;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("最终通知");
        }
    }
}
