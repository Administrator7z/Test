package com.xxx.demotest;



import com.xxx.demo.proxy3.BookServiceImpl;
import com.xxx.demo.proxy3.Buy;
import com.xxx.demo.proxy3.LogProxy;
import com.xxx.demo.proxy3.TransProxy;
import org.junit.Test;

import java.awt.print.Book;

public class MyTest03 {
    @Test
    public void test01(){
        //创建谁的对象
        Buy proxy = new TransProxy(new BookServiceImpl());
        proxy.buy();
    }

    @Test
    public void test02(){
        //创建谁的对象
        Buy proxy = new LogProxy(new TransProxy(new BookServiceImpl()));
        proxy.buy();
    }
}
