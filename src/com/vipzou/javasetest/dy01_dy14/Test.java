package com.vipzou.javasetest.dy01_dy14;

public class Test {
    public static void main(String[] args) {
        Student cxk = new Student();
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
