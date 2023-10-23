package com.alibaba.server.jdkInvoke;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 5:23
 */
public class AliPayService implements PayService {
    @Override
    public void pay(){
        System.out.println("支付");
    }
}
