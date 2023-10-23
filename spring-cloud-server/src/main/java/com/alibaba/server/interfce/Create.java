package com.alibaba.server.interfce;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 1:53
 */
public class Create {
    @OrderInterface
    public void createOrder(){
        System.out.println("已经创建完订单");
    }
}
