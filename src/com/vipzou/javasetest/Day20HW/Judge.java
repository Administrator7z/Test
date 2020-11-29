package com.vipzou.javasetest.Day20HW;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String patter = "\\d{18}";
        while (!id.matches(patter)) {
            System.out.println("×");
            id = sc.next();

        }
        if (id.charAt(16) % 2 == 0) {
            System.out.println("nv");
            return;
        } else {
            System.out.println("na");
            return;
        }

    }
}
