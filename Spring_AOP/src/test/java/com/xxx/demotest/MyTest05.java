package com.xxx.demotest;

import com.xxx.demo.proxy5.*;
import org.junit.Test;

public class MyTest05 {
    @Test
    public void test01(){
        //创建谁的对象，测事务
        Buy proxy = (Buy)AopDynamicProxy.getProxy(new BookServiceImpl(),new TransAop());
       // proxy.buy();
        proxy.sell();
    }

    @Test
    public void test02(){
        //创建谁的对象，测日志
        Buy proxy = (Buy)AopDynamicProxy.getProxy(new BookServiceImpl(),new LogAop());
        proxy.buy();
    }
    @Test
    public void test03(){
    //测组合
        Buy proxy = (Buy)AopDynamicProxy.getProxy(new BookServiceImpl(),new TransAop());
        Buy proxy1 = (Buy)AopDynamicProxy.getProxy(proxy,new LogAop());
        proxy1.buy();

    }
}
