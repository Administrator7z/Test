package com.vipzou.javasetest.Day01_Day13;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("行");
        if (sc.hasNextInt()) {

            a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {

                    if (i == 1 || i == a) {
                        System.out.print("*");
                    } else if (k == 1 || k == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (int q = 1; q <= a - 1; q++) {

                for (int w = 1; w <= q; w++) {
                    System.out.print(" ");
                }
                for (int e = 1; e <= 2 * (a - q) - 1; e++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            System.out.println("x");
        }
        for (int i = 0; i < 8; i++) {
            for (int k = 8; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
