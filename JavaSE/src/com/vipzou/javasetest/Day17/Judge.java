package com.vipzou.javasetest.Day17;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("yyyy mm dd");
        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int sumdays = Mm(yyyy,mm,dd);
        System.out.println("第"+sumdays+"天");


    }

    public static int Mm(int yyyy,int mm,int dd) {
        int a = 0;
        for (int i = 1; i < mm; i++) {

            a += JudgeMm(yyyy,i);

        }
        return a +dd;
    }

    public static int JudgeMm(int yyyy,int mm) {
        switch (mm) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(leap(yyyy)){
                    return 29;
                }else {
                    return 28;
                }

        }
        return 0;

    }

    private static boolean leap(int yyyy) {
        return yyyy % 4 == 0 && yyyy % 100 != 0 || yyyy % 400 == 0 ;
    }
}
