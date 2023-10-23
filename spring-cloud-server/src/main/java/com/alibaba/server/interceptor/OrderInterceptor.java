package com.example.order.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 3:42
 */

public class OrderInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final String userName = request.getParameter("userName");
        System.out.println(request.getHeader("X-Token"));
        System.out.println(request.getHeader("Authorization"));
        System.out.println(request.getParameter("access_token"));
        System.out.println(request.getSession().getId());
        if(!"admin".equals(userName)){
            throw new RuntimeException("用户没有权限！！！");
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
