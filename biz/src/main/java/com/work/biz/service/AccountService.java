package com.work.biz.service;

import com.work.biz.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();
    Account getAccountById(String id);
}
