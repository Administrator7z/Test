package com.xxx.demo.proxy3;

public class LogProxy implements Buy {
    Buy yewu;

    public LogProxy(Buy yewu){
        this.yewu = yewu;
    }

    @Override
    public void buy() {
        System.out.println("前置日志记录.............");
        yewu.buy();
    }
}
