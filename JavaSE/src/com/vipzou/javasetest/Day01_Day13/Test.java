package com.vipzou.javasetest.Day01_Day13;

public class Test {
    public static void main(String[] args) {
        Student00 cxk = new Student00();
        cxk.setName("鸡哥");
        cxk.setAge(11);
        cxk.setGender('男');
        cxk.setHeight(1.55);
        cxk.setWeight(55.5);
        System.out.println("姓名：" + cxk.getName());
        System.out.println(cxk.getAge());
        System.out.println(cxk.getGender());
        System.out.println(cxk.getHeight());
        System.out.println(cxk.getWeight());
        cxk.toString();
        System.out.println(cxk.toString());


    }
}
