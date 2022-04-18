package com.alibaba.comfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/17 20:42
 */
@RestController
@RefreshScope //支持Nacos得动态刷新功能
public class ConfigController {

    @Value("${config}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
