package com.xxx.demo.proxy2;

public class BookServiceImpl {
    //主业务的实现
    public void buy(){
        //事务不用管，由子类去代理，只要实现真正的业务功能就行
        System.out.println("图书购买业务的实现..............");
    }
}
