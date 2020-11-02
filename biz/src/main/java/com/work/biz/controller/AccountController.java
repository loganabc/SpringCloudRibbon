package com.work.biz.controller;

import com.work.biz.entity.Account;
import com.work.biz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @ResponseBody
    @RequestMapping("/queryById")
    public Map getAccountById(String id){
        Map<String,Object> map = new HashMap<>();
        List<Account> list = new ArrayList<Account>();
        list.add(accountService.getAccountById(id));
        map.put("code",200);
        map.put("user",list);
        return map;
    }
}
