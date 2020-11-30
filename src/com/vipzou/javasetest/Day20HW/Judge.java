package com.vipzou.javasetest.Day20HW;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String patter = "[0-9]\\d{16}[0-9xX]]";
        while (!id.matches(patter)) {
            System.out.println("×");
            id = sc.next();

        }
        String yearStr = patter.substring(10,12);
        String MounthStr = patter.substring(13,14);
        String DayStr = patter.substring(15,16);
        int year = Integer.parseInt(yearStr);
        int mounth = Integer.parseInt(MounthStr);
        int day = Integer.parseInt(DayStr);
//        char sex = id.charAt(16);
//        int num = (int)sex;
//        num = sex - '0';
        if (id.charAt(16) % 2 == 0) {
            System.out.println("nv");
            return;
        } else {
            System.out.println("na");
            return;
        }

    }
}
