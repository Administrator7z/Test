package com.xxx.demo.proxy4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("前置日志记录............");
    }
}
