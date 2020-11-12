package com.vipzou.javasetest.dy01_dy14;

public class For {
    public static void main(String[] args) {
        main7();
    }

    public static void main1() {
        for (int i = 1001; i < 2000; i++) {
            if (i % 191 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main2() {
        int i = 50;
        while (i <= 60) {
            System.out.println(i);
            i++;
        }
    }

    public static void main3() {
        int i = 800;
        while (i <= 900) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
            i++;
        }
    }

    public static void main4() {
        int i = 2001;
        while (i <= 3000) {
            if (i % 185 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }

    public static void main5() {
        int i = 1;
        do {
            System.out.println(i);
            i++;

        } while (i <= 100);
    }

    public static void main6() {
        int i = 119;
        do {
            if (i % 119 == 0) {
                System.out.println(i);
            }
            i++;


        } while (i <= 999);
    }

    public static void main7() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("*");

            }
            System.out.println("*");
        }
    }


}


