package com.xxx.demo.proxy2;

public class SubBookServiceImpl extends BookServiceImpl {
    //实现事务的代理功能

    @Override
    public void buy() {
        try {
            //子类来完成事务功能的代理
            System.out.println("事务开启..............");
            super.buy();//父类的主业务功能的实现，切记：由目标对象实现自己的功能
            System.out.println("事务提交..............");
        } catch (Exception e) {
            System.out.println("事务回滚..............");

        }
    }
}
