package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;

import static com.vipzou.javasetest.dy01_dy14.Method01.judge2;

public class Method05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数");
        int num = sc.nextInt();
        System.out.println(judge2(num));
    }
}
