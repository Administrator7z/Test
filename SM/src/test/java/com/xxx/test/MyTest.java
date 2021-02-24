package com.xxx.test;

import com.xxx.pojo.Accounts;
import com.xxx.pojo.Users;
import com.xxx.service.AccountsService;
import com.xxx.service.impl.AccountsServiceImpl;
import com.xxx.service.UsersService;
import com.xxx.service.impl.UsersServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    ApplicationContext ac;
    @Before
    public void getAc(){
        ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
    }
    @Test
    public void testInsereUsers(){
        UsersService service = ac.getBean(UsersServiceImpl.class);
        int num = service.insertUsers(new Users(100,"张三","12345"));
        System.out.println(num);
    }
    @Test
    public void testSaveAccounts(){
        AccountsService service = ac.getBean(AccountsServiceImpl.class);
        int num = service.saveAccounts(new Accounts(100,"张三","12345"));
        System.out.println(num);
    }
}
