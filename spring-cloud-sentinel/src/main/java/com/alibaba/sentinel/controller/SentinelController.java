package com.alibaba.sentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/23 23:16
 */
@RestController
@Slf4j
public class SentinelController {

    @GetMapping("/query")
    public String query(){
        log.info(Thread.currentThread().getName());
        return "successful";
    }
}
