package com.vipzou.javasetest.dy01_dy14;

public class Demo06 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
