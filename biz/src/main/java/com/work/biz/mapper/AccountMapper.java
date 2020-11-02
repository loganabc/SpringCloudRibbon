package com.work.biz.mapper;

import com.work.biz.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    List<Account> getAllAccount();
    Account getAccountById(String id);
}
