package com.alibaba.server.controller;

import com.alibaba.server.service.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;

/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 0:00
 */
@RestController
@RequestMapping(value = "/serverApi")
public class ServerController {

    @Autowired
    private IServerService serverService;

    @PostMapping(value = "/server/query")
    public String queryServer() {
        return serverService.queryServer();
    }
}
