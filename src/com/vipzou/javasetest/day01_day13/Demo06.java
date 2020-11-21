package com.vipzou.javasetest.day01_day13;

public class Demo06 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
