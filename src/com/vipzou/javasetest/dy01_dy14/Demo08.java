package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("S");
        String s = sc.next();
        for (int i = s.length() - 1; i >= 0 ; i--){
            System.out.println(s.charAt(i));
        }

    }
}
