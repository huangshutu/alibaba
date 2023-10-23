package com.alibaba.server.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/10 3:03
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event){
        System.out.println("我已监听到"+event.getClass());
    }
}
