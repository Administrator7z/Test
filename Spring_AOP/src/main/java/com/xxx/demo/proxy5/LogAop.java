package com.xxx.demo.proxy5;

public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("前置日志记录............");
    }
}
