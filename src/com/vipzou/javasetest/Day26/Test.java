package com.vipzou.javasetest.Day26;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            p1.setAge(1000);
        } catch (AgeOutOfBoundsException e) {
            e.printStackTrace();
        }
        p1.setName("a");
        try {
            p1.setGender("?");
        } catch (IllegaGenderException e) {
            e.printStackTrace();
        }
        System.out.println(p1.getAge());

    }
}
