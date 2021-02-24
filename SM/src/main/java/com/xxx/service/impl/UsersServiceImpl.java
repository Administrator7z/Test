package com.xxx.service.impl;

import com.xxx.mapper.UsersMapper;
import com.xxx.pojo.Accounts;
import com.xxx.pojo.Users;
import com.xxx.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;
    @Autowired
    AccountsServiceImpl accountsService;


    @Override
    public int insertUsers(Users users) {
        accountsService.saveAccounts(new Accounts(10,"张三","哈哈"));
        return usersMapper.insertUsers(users);
    }
}
