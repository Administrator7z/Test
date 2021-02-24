package com.xxx.service.impl;

import com.xxx.mapper.AccountsMapper;
import com.xxx.pojo.Accounts;
import com.xxx.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    AccountsMapper accountsMapper;

    @Override
    public int saveAccounts(Accounts accounts){
        int num = accountsMapper.saveAccounts(accounts);
        System.out.println(num);
        int num2 = 100/0;
        return num;
    }

}
