package com.alibaba.client.service.impl;

import com.alibaba.client.service.IClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 22:46
 */
@Service
@Slf4j
public class ClientServiceImpl implements IClientService {

    @Resource
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serverUrl;

    @Override
    public String queryClient(){
        return restTemplate.getForObject(serverUrl+"/serverApi/server/query",String.class);
    }
}
