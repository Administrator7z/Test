package com.vipzou.javasetest.dy01_dy14;

public class Method03 {
    public static void main(String[] args) {

        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < 30; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }




    }
}
/*
输出如下效果的前30个值
        0	1	1	2	3	5	8	13	21	.......
        a	b	sum
            b	a	sum
                a	b	sum*/
