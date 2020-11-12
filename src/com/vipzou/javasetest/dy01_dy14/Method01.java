package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {

        print();
    }

    public static void message() {
        Scanner sc = new Scanner(System.in);
        System.out.println("姓");
        String name = sc.next();
        System.out.println("年");
        String age = sc.next();
        System.out.println(name + "\t" + age);

    }

    public static String judge(int a) {
        if (a > 0) {
            return "正";
        } else if (a < 0) {
            return "负";
        } else {
            return "×";
        }

    }

    public static int judge2(int a) {
        int x = a / 100 % 10;
        int y = a / 10 % 10;
        int z = a % 10 % 10;
        return x + y + z;
    }

    public static int reload(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }

    }

    public static double reload(double a, double b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static double reload(int a, double b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static double reload(double a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static void print() {
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 0; i < 30; i++) {

            if (i == 0 || i == 1) {
                System.out.print(1 + ",");
            } else {

                int flag = sum1 + sum2;

                sum1 = sum2;

                sum2 = flag;
                System.out.print(flag + ",");
            }
        }

    }
}


