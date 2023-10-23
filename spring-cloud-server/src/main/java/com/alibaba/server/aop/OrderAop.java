package com.alibaba.server.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 2:23
 */
@Component
@Aspect
public class OrderAop {
    @Pointcut("@annotation(com.alibaba.server.aop.AopInterceptor)")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("in before");
        final RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        final ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        final HttpServletRequest request = servletRequestAttributes.getRequest();
        String userName = request.getParameter("userName");
        final MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        final AopInterceptor declaredAnnotation = method.getDeclaredAnnotation(AopInterceptor.class);
        if(declaredAnnotation != null && ( !"admin".equals(userName)
                || !"admin".equals(declaredAnnotation.value()))){
            throw new RuntimeException("用户没有权限访问");
        }
    }
}
