package com.vipzou.javasetest.day01_day13;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("年");
        int age = sc.nextInt();
        String result = judge01(age);
        System.out.println(result);
    }

    private static String judge01(int age) {
        if (age >= 60) {
            return "老";
        } else if (age >= 40) {
            return "中";
        } else if (age >= 20) {
            return "少";
        } else {
            return "青";
        }
    }
}
