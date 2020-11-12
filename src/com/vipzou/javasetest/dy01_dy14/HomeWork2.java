package com.vipzou.javasetest.dy01_dy14;

public class HomeWork2 {

    public static void main(String[] args) {
        a();
    }

    public static String week(int a) {
        switch (a) {
            case 7:
                return "7";

            case 1:
                return "1";

            case 2:
                return "2";
            default:
                return "0";

        }

    }
    public static void a () {

        for (char i = 97;i<= 122 ; i++ ){
            System.out.print(i);

        }


    }



}
