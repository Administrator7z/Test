package com.vipzou.javasetest.Day20HW;

public class Reverse {
    public static void main(String[] args) {
        String s1 = new String("WDNMD");
        System.out.println(reverse(s1));
    }

    private static String reverse(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        return sb.toString();

    }
}
