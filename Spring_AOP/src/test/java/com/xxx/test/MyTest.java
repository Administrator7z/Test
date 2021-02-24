package com.xxx.test;

import com.xxx.s01.SomeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    ApplicationContext ac;
    @Before
    public void ac(){
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
    @Test
    public void test1(){
        SomeService ss = (SomeService) ac.getBean("someService");
        //ss.doSome("张三",20);
        ss.doAround("张三");
    }
}
