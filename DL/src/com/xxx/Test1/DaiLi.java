package com.xxx.Test1;

public class DaiLi implements YeWuService {
    YeWuService zhou;

    public DaiLi(YeWuService zhou) {
        this.zhou = zhou;
    }

    @Override
    public void sing() {
        System.out.println("准备");
        zhou.sing();
        System.out.println("结束");

    }
}
