package com.vipzou.javasetest.day01_day13;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        print1();


        Scanner sc = new Scanner(System.in);
        System.out.println("姓");
        String name = sc.next();
        System.out.println("年");
        int age = sc.nextInt();
        System.out.println("性");
        char sex = sc.next().charAt(0);
        System.out.println("址");
        String add = sc.next();
        System.out.println("高");
        double hei = sc.nextDouble();
        System.out.println("重");
        double wei = sc.nextDouble();
        print(name, age, sex, add, hei, wei);
    }

    public static void print(String name, int age, char sex, String add, double hei, double wei) {
        System.out.println("姓:" + name + "年:" + age + "性:" + sex + "址:" + add + "高:" + hei + "重:" + wei);
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
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;
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

    public static void print1() {
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


