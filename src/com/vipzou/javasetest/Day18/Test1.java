package com.vipzou.javasetest.Day18;

public class Test1 {
    public static void main(String[] args) {
        sum(10, 20, 30, 40);
    }

    private static void sum(int... sum) {
        int a = 0;
        for (int i = 0; i < sum.length; i++) {
            a += sum[i];
        }
        System.out.println(a);
    }
}
