package com.work.biz.service.impl;

import com.work.biz.entity.Account;
import com.work.biz.mapper.AccountMapper;
import com.work.biz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    public AccountMapper accountMapper;

    @Override
    public List<Account> getAllAccount() {
        return accountMapper.getAllAccount();
    }

    @Override
    public Account getAccountById(String id) {
        return accountMapper.getAccountById(id);
    }
}
