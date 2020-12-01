package com.vipzou.javasetest.Day01_Day13;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        main8();
    }


    //如果用户名等于”admin”，密码等于”123456”，则输出”欢迎您，admin”，否则输出”对不起，您不是admin”
    public static void main0() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户名:");
        String user = scanner.next();
        System.out.print("密码:");
        int password = scanner.nextInt();
        if (user.equals("admin")) {
            if (password == 123456) {
                System.out.println("欢迎您，admin");
            } else {
                System.out.println("密不正确");
            }
        } else {
            System.out.println("对不起，您不是admin");
        }
    }

    //从键盘输入3个整数，分别赋给变量a、b、c，
    //然后将输入的整数值按照从小到大的顺序存放在变量a、b、c中，并输出三个变量的值。

    public static void main1() {
        Scanner scanner = new Scanner(System.in);
        int[] li = new int[3];
        System.out.print("整数1:");
        li[0] = scanner.nextInt();
        System.out.print("整数2:");
        li[1] = scanner.nextInt();
        System.out.print("整数3:");
        li[2] = scanner.nextInt();
        /*if (x < y && y < z) {
            System.out.print(x+"<"+y+"<"+z);
        }
        else if (y < z && z < x) {
            System.out.print(y+"<"+z+"<"+x);
        }
        else {
            System.out.print(z+"<"+x+"<"+y);
        }*/
        int a;
        for (int i = 0; i < li.length - 1; i++) {
            for (int j = li.length - 1; j > i; j--) {
                if (li[j] < li[j - 1]) {
                    a = li[j];
                    li[j] = li[j - 1];
                    li[j - 1] = a;

                }
            }
        }
        for (int i = 0; i < li.length; i++) {
            System.out.println(li[i]);
        }
    }

    //张三准备要去美国旅游，现在要订购机票。机票的价格受季节旺季、淡季影响，
    //而且头等舱和经济舱价格也不同。其中，4—10月为旺季，旺季头等舱打九折，经济舱打八折，
    //淡季头等舱打五折，经济舱打四折。

    public static void main2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("月份");
        int mou = scanner.nextInt();
        System.out.println("票价");
        int mon = scanner.nextInt();
        if (mou >= 4 && mou <= 10) {
            System.out.println("头等折价" + mon * 0.9 + "\n" + "经济折价" + mon * 0.8);
        } else {
            System.out.println("头等折价" + mon * 0.5 + "\n" + "经济折价" + mon * 0.4);
        }
    }


    //判断一个三位数是否为水仙花数，一个数等于各位数的立方和就是水仙花数。如153==1*1*1 + 5*5*5 + 3*3*3

    public static void main3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数");
        int x = scanner.nextInt();
        int a = x / 1 % 10;
        int b = x / 10 % 10;
        int c = x / 100;
        if (x == (a * a * a + b * b * b + c * c * c)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }

    }

    //验证三角形的有效性,提示用户输入三个边长,判断是否构成三角形

    public static void main4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数1");
        int a = scanner.nextInt();
        System.out.print("数2");
        int b = scanner.nextInt();
        System.out.print("数3");
        int c = scanner.nextInt();
        if (a + b > c || b + c > a || a + c > b) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }

    //从键盘上输入一个数字(1~7)代表今天是星期几, 输入间隔的天数n, 输出n天后是星期几?

    public static void main5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("今天星期");
        int w = scanner.nextInt();
        System.out.print("间隔天数");
        int d = scanner.nextInt();
        print01(w, d);


    }

    public static void print01(int w, int d) {
        switch ((w + d) % 7) {
            case 0:
                System.out.println("星日");
                break;
            case 1:
                System.out.println("星1");
                break;
            case 2:
                System.out.println("星2");
                break;
            case 3:
                System.out.println("星3");
                break;
            case 4:
                System.out.println("星4");
                break;
            case 5:
                System.out.println("星5");
                break;
            case 6:
                System.out.println("星6");
                break;
        }
    }

    //从键盘上按hh mm ss的格式输入一个时间，输出这个时间的前一秒

    public static void main6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hh mm ss");
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        s++;
        if (s >= 60) {
            s = 0;
            m++;
        }
        if (m >= 60) {
            m = 0;
            h++;
        }
        if (h >= 24) {
            h = 0;
        }
        System.out.println("下一秒：" + h + ":" + m + ":" + s);
    }

    public static void main7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输名次");
        String a = scanner.next();
        switch (a) {
            case " 第一名":
                System.out.println("100W");
                break;
            case "第二名":
                System.out.println("50W");
                break;
            case "第三名":
                System.out.println("20W");
                break;
            default:
                System.out.println("没有");

        }
    }
    public static void main8(){

        for (char ch = 'z'; ch >= 'a';ch--){
            System.out.print(ch+"\t");
        }

    }



}

