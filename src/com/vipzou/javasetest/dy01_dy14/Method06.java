package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;

public class Method06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数");
        int num = sc.nextInt();
        print(num);

    }

    public static void print(int num) {
        if (num <= 100 || num >= 90){
            System.out.println("A");

        }else if (num < 90 || num >=80){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
