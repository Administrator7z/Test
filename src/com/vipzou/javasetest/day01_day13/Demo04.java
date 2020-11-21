package com.vipzou.javasetest.day01_day13;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner hour = new Scanner(System.in);
        System.out.print("输入时间：");
        double time = hour.nextDouble();
        System.out.println(judge(time));

    }

    public static String judge(double time) {
        if (time <= 0 || time >= 24) {
            return "输入错误";
        } else if (time >= 6 && time < 12) {
            return "上午";
        } else if (time >= 12 && time <= 18) {
            return "下午";
        } else {
            return "晚上";
        }
    }
}
