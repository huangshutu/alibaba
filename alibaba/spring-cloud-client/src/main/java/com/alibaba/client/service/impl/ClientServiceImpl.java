package com.alibaba.client.service.impl;

import com.alibaba.client.service.IClientService;
import com.alibaba.common.service.IFeignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 22:46
 */
@Service
public class ClientServiceImpl implements IClientService {

    @Resource
    private IFeignService feignService;

    @Override
    public String queryClient(){
       return feignService.queryServer();
    }
}
