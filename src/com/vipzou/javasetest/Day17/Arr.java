package com.vipzou.javasetest.Day17;

public class Arr {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        int[] intArr3 = {1,2,3,4,5};

        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);

        }
        for (int x : intArr) {
            System.out.println(x);
        }
        int[] intarr2 = intArr;

        intarr2[0] = 1;

        for (int x : intArr) {
            System.out.println(x);
        }

    }
}
