package com.vipzou.javasetest.Day19;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] intArr = {10, 12, 40, 12, 23, 41, 52, 12, 2};

        //sort(intArr);
        sort2(intArr);
        print(intArr);
        Arrays.sort(intArr); //排序
        Arrays.toString(intArr);
        int[] intArr2 = Arrays.copyOf(intArr, intArr.length * 2);
        System.out.println(Arrays.binarySearch(intArr, 12));


    }


    private static void sort2(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < intArr[i]) {

                    int t = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = t;

                }

            }

        }

    }

    public static void sort(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int t = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = t;


                }
            }

        }
    }

    private static void print(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i + "\t");
        }
    }
}
