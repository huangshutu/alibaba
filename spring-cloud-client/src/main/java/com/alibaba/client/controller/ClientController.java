package com.alibaba.client.controller;

import com.alibaba.client.service.IClientService;
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
@RequestMapping(value="/clientApi")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @PostMapping("/query")
    public String queryClient() {
            return clientService.queryClient();
    }
}
