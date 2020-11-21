package com.vipzou.javasetest.day01_day13;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("s");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("shucuowu");
            return;
        }
        do {
            int gw = num % 10;
            System.out.print(gw);
            num /= 10;
            if (num == 0) {
                break;
            }
        } while (true);
    }
}
