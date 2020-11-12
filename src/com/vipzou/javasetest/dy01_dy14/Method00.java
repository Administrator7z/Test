package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;

public class Method00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }
    }

}
