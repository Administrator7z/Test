package com.vipzou.javasetest.day01_day13;

import java.util.Scanner;

public class Method07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("s");
        int num = sc.nextInt();
        judge(num);
    }

    public static void judge(int num) {
        if(num % 2 != 0){
            System.out.println(num+"jishu");
        }else {

            System.out.println(num+"oushu");
        }
    }
}
