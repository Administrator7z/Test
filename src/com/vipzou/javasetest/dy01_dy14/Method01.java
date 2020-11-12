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

    public static  void print() {
        int sum1=1;//定义第一项为1
        int sum2=1;//定义第二项为1
        for(int i=0;i<30;i++)
        {
            //一二项都为1
            if(i==0||i==1)
            {
                System.out.print(1+",");
            }
            //其余的都是前两项的和
            else
            {
                //前两项的和
                int flag=sum1+sum2;
                //把前一项的值赋给前一项的再前面一项
                sum1=sum2;
                //把当前项赋给前一项
                sum2=flag;
                System.out.print(flag+",");
            }
        }

    }
}


