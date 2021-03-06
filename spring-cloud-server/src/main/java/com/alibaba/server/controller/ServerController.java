package com.alibaba.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 0:00
 */
@RestController
@Slf4j
public class ServerController {

    @GetMapping("/query")
    public String query(){
        log.info(Thread.currentThread().getName());
        return "successful";
    }
}
