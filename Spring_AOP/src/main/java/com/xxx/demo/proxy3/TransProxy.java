package com.xxx.demo.proxy3;

public class TransProxy implements Buy {

    //创建目标对象,就是主业务功能实现对象
    Buy yewu;

    //传入目标对象
    public TransProxy(Buy yewu){
        this.yewu = yewu;
    }

    @Override
    public void buy() {
        try {
            //来增强业务功能 ,添加事务处理
            System.out.println("事务开启...............");
            //目标对象自己实现业务功能
            yewu.buy();
            System.out.println("事务提交...............");
        } catch (Exception e) {
            System.out.println("事务回滚...............");
        }
    }
    //静态代理必须要实现与目标对象相同的业务接口
}
