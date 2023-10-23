package com.alibaba.server.aop;

import org.aspectj.lang.annotation.Pointcut;

import java.lang.annotation.*;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 3:02
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AopInterceptor {
    String value() default "admin";
}
