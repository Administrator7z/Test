package com.vipzou.javasetest.Day20;

public class TestS {

    private static String s1;

    public static void main(String[] args) {
        byte[] b1 = {65, 66, 67, 68, 69, 70};
        s1 = new String(b1);
        System.out.println(s1);
        String s2 = new String(b1, 0, 6);
        System.out.println(s2.length());

        System.out.println("啊啊".compareTo("哦哦"));


        char[] c1 = {'A', 'B', 'C', 'D', '邹', 97, 98, 30086};
        String s3 = new String(c1);
        System.out.println(s3);
        s3 = new String(c1, 0, 7);
        System.out.println(s3);


    }
}
