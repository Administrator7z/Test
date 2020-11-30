package com.vipzou.javasetest.Day20HW;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s1 = "1001,lisi,98;2002,wangwu,76;3003,chenqi,84;" +
                "4004,zhangsan,49;5005,xiaoming,67";
        String[] split = s1.split("[,;]");
        Student[] s0 = new Student[10];
        int size = 0;
        for (int i = 0; i < split.length; i++) {
            if (i % 3 == 0) {
                s0[size] = new Student(Integer.parseInt(split[i]), split[i + 1], Integer.parseInt(split[i + 2]));
                size++;
            }
        }
        
        sort(s0, size);
        System.out.println(find(s0, size,"xiaoxiao"));

    }

    private static void sort(Student[] s0, int size) {
        Arrays.sort(s0);
        for (int i = 0; i < size; i++) {
            //System.out.println("学号：" + s0[i].getStuNum() + "\t姓名：" + s0[i].getName() + "\t成绩：" + s0[i].getGrade());
            System.out.println(s0[i]);
        }
    }

    private static boolean find(Student[] s0, int size,String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(s0[i].getName())) {
                return true;
            }
        }
        return false;
    }
}
