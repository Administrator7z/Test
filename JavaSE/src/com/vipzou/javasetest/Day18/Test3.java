package com.vipzou.javasetest.Day18;

public class Test3 {
    public static void main(String[] args) {
        int[] intArr = { 10, 20, 30, 40, 50, 60} ;
        intArr = chaRu(intArr, 2, 69);
        for (int i : intArr) {
            System.out.print("\t"+i);

        }
    }

    private static int[] chaRu(int[] intArr, int i, int i1) {
        int[] bigger = new int[intArr.length+1];
        System.arraycopy(intArr, 0, bigger, 0, i);
        bigger[i] = i1;
        System.arraycopy(intArr, i, bigger, i + 1, intArr.length - i);
        return bigger;

    }
}
