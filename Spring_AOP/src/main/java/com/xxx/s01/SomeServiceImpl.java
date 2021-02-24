package com.xxx.s01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, int age) {
        System.out.println("执行主方法");
    }

    @Override
    public String doFirst(String name) {

        System.out.println("执行主方法"+name);
        return name;
    }

    @Override
    public String doAround(String name) {
        System.out.println("执行主方法"+name);
        return name;
    }
}
