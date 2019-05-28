package com.hzp.controller;

import com.hzp.dao.firstslaver.MmmMapper;
import com.hzp.dao.master.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutilDatasourceTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MmmMapper mmmMapper;

    @RequestMapping("/mutidata")
    public String test(){
        return "hello";
    }
}
