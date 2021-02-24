package com.xxx.Test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Ge {
    public static void main(String[] args) {
        Sevice factory = new ChangJia();
        int j = factory.Fuwu();



        InvocationHandler hander = new DaiLi(factory);
        Sevice sevice = (Sevice) Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),hander);
        int i = sevice.Fuwu();
        System.out.println(j+"--"+i);
    }
}
