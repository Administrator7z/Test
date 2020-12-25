package com.vipzou.javasetest.Day18;

public class Test2 {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        intArr = kuoRong(intArr, 20);
        for (int i : intArr) {
            System.out.print(i);

        }
    }

    private static int[] kuoRong(int[] intArr, int newLength) {
        if (intArr.length > newLength) {
            return intArr;
        }
        int[] bigger = new int[newLength];
//        for (int i = 0; i < intArr.length; i++) {
//            bigger[i] = intArr[i];
//
//        }
        System.arraycopy(intArr, 0, bigger, 0, intArr.length);
        return bigger;

    }
}
