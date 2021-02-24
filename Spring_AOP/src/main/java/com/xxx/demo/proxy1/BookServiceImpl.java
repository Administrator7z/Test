package com.xxx.demo.proxy1;

public class BookServiceImpl {
    /**
     * 实现图书购买的功能，并且添加事务处理
     */
    public void buy(){
        try {
            //事务处理
            System.out.println("事务开启..............");
            //业务处理
            System.out.println("图书购买业务的实现..........");
            System.out.println("事务提交................");
        } catch (Exception e) {
            System.out.println("事务回滚................");
        }
    }
}
