package com.example.order.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @description: 自定义事件
 * @author: shutu
 * @date: 2023/10/10 2:58
 */
public class MyEvent extends ApplicationEvent {
    private static final long serialVersionId = -1;

    public MyEvent(Object source){
        super(source);
    }
}
