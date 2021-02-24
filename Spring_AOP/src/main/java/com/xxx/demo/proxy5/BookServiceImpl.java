package com.xxx.demo.proxy5;

public class BookServiceImpl implements Buy {
    @Override
    public void buy() {
        System.out.println("图书购买业务实现...................");
    }

    @Override
    public void sell() {
        System.out.println("图书销售业务...............");
    }
}
