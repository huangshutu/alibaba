package com.alibaba.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/17 17:19
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  //赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
