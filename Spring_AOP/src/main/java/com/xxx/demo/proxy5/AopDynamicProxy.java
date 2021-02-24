package com.xxx.demo.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopDynamicProxy  {

    //业务对象接口

    //切面对象接口

    //传入的构造方法

    public static Object getProxy(Buy yewu,AOP aop){
        return Proxy.newProxyInstance(
                yewu.getClass().getClassLoader(),
                yewu.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object obj = null;
                        try {
                            aop.before();
                            obj = method.invoke(yewu,args);
                            aop.after();
                        } catch (Exception e) {
                            aop.exception();
                        }
                        return obj;
                    }
                }
        );
    }
}
