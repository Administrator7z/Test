package com.vipzou.javasetest.day01_day13;

public class Tset3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student(45, "鸡哥", 20, '男',
                new Grade(1, "班", "三楼"));
        System.out.println(s2.toString());

    }
}
