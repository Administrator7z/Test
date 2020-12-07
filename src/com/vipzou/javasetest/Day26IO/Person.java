package com.vipzou.javasetest.Day26IO;

import java.io.Serializable;

/**
 * 定义Person类,想要实现Person对象的序列化, 前提是Person类必须实现Serializable接口
 * 动力节点
 * 2020/12/7
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -9016772883116062778L;
    String name;
    int age;
    String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
