package com.alibaba.client.service.impl;

import com.alibaba.client.service.IClientService;
import lombok.extern.slf4j.Slf4j;
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

    @Override
    public String queryClient(){
        return restTemplate.postForObject("http://alibaba-cloud-server/serverApi/server/query",null,String.class);
    }
}
