package com.xxx.Test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DaiLi implements InvocationHandler {
    private Object target;

    public DaiLi(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(target, args);
        if (res != null) {
            int i = (int) res;
            i = i + 1;
            res = i;
        }
        return res;

    }
}
