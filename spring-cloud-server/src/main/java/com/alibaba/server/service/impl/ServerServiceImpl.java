package com.alibaba.server.service.impl;

import com.alibaba.server.service.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


/**
 * @description:
 * @author: shutu
 * @date: 2022/4/14 0:03
 */
@Service
public class ServerServiceImpl implements IServerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${config}")
    private String configInfo;

    @Override
    public String queryServer(){
        String sql = "select name from user";
        return jdbcTemplate.queryForObject(sql, String.class) + configInfo;
    }
}
