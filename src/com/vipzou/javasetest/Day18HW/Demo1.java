package com.vipzou.javasetest.Day18HW;

public class Demo1 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50, 60};
        intArr = del(intArr, 3);
        for (int i : intArr) {
            System.out.println(i);

        }
    }

    private static int[] del(int[] intArr, int i) {
        int[] newIntArr = new int[intArr.length - 1];

        System.arraycopy(intArr,0,newIntArr,0,i);
        System.arraycopy(intArr,i+1,newIntArr,i,newIntArr.length-i);
        return newIntArr;

    }
}
