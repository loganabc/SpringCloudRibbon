package com.work.biz.controller;

import com.work.biz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    @Autowired
    public AccountService accountService;

    @ResponseBody
    @RequestMapping("/hello1")
    public String test1(){
        return "hello1";
    }

    @ResponseBody
    @RequestMapping("/hello2")
    public String hello2(String name){

        return "Hello, "+name+". You are success to get this page.";

    }

    @ResponseBody
    @RequestMapping("/hello3")
    public Map<String,Object> hello3(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("userList",accountService.getAllAccount());
        return map;
    }
}
