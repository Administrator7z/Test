package com.vipzou.javasetest.Day31;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = String.class;
        Class c2 = "String".getClass();
        Class c3 = Class.forName("java.lang.String");
        Class c4 = int.class;
        Class c5 = int[].class;
    }
}
