package com.xxx.demotest;


import com.xxx.demo.proxy2.BookServiceImpl;
import com.xxx.demo.proxy2.SubBookServiceImpl;
import org.junit.Test;

public class MyTest02 {
    @Test
    public void test01(){
        BookServiceImpl proxy = new SubBookServiceImpl();
        proxy.buy();
    }
}
