package com.example.order.controller;


import com.example.order.aop.AopInterceptor;
import com.example.order.listener.MyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 2:20
 */
@RestController
public class OrderController {

  @Resource
  private ApplicationContext context;

  @GetMapping("/order")
  public String order(){
   MyEvent event = new MyEvent(this);
  context.publishEvent(event);
   return "有访问权限";
  }

}
