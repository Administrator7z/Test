package com.vipzou.javasetest.Day17HW;


import java.util.Scanner;

//从键盘上输入10个同学的成绩保存到数组中,计算所有同学的平均成绩,统计成绩高于平均分学生的人数, 找出数组中最高分同学的索引值
public class Demo1 {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            int x = sc.nextInt();
        }
        int b = 0;
        int c = 0;
        //int e = 0;
        int f = 0;
        for (int i = 0; i < intArr.length; i++) {
            int a = 0;
            a += intArr[i];
            if (i == intArr.length - 1) {
                b = a / 10;
                System.out.println("平均分" + b);
            }
            if (i >= 1) {
                if (intArr[i] < intArr[i - 1]) {

//                    intArr[i] = intArr[i] + intArr[i - 1];
//                    intArr[i - 1] = intArr[i] - intArr[i - 1];
//                    intArr[i] = intArr[i] - intArr[i - 1];
//                    e = intArr[i];
                    f = i;

                }

            }


        }
        for (int i : intArr) {
            if (i > b) {
                c++;
            }
        }
        System.out.println("高于平均人数" + c);
        //System.out.println("最高分" + e);
        System.out.println("最大索引值" + f);
    }
}

