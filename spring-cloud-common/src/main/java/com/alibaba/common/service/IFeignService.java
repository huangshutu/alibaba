package com.alibaba.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 21:49
 */
@FeignClient(value = "alibaba-cloud-server")
public interface IFeignService {

    @PostMapping("/server/serverApi/server/query")
    String queryServer();
}
