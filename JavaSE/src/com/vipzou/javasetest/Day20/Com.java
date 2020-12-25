package com.vipzou.javasetest.Day20;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Com {
    public static void main(String[] args) {

        Student s1 = new Student("啊啊", 20);
        Student s2 = new Student("哦哦", 13);
        Student s3 = new Student("哈哈", 24);
        Student s4 = new Student("呵呵", 12);
        Student[] s0 = {s1, s2, s3, s4};
        Arrays.sort(s0);
        for (Student student : s0) {
            System.out.println(student);

        }
        String s8 = new String("耗子尾汁");
        System.out.println(s8.concat("!!!"));
        System.out.println(s8.contains("子尾"));
        System.out.println(s8.startsWith("耗"));
        System.out.println(s8.endsWith("汁"));

        byte[] b1 = s8.getBytes();
        System.out.println(Arrays.toString(b1));
        String s9 = new String(b1);
        System.out.println(s8);
        System.out.println(s9);

        String path = "C:\\Users\\Administrator\\NiuBi.exe";
        String root = path.substring(0, 2);
        int last = path.lastIndexOf("\\");
        int dot = path.lastIndexOf(".");
        String folder = path.substring(0, last);
        String filename = path.substring(last + 1, dot);
        String suffix = path.substring(dot + 1);
        System.out.println(root);
        System.out.println(folder);
        System.out.println(filename);
        System.out.println(suffix);

        String s10 = new String(" 我屌你妈的 WDNMD ");
        char[] chars = s10.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);

        }
        s10 = new String(chars);
        System.out.println(s10);
        String s11 = new String(s10.toLowerCase());
        System.out.println(s11);
        String s12 = new String(s10.toUpperCase());
        System.out.println(s12);
        String s13 = s10.trim();             //去掉前后空格
        System.out.println("*" + s13 + "*");
        String s14 = String.valueOf(123456);  //int转换字符串
        System.out.println(s14);
        String s15 = new String("123456");
        int num = Integer.parseInt(s15);   //字符串转换int
        System.out.println(num);

        System.out.println("----------------");
        //正则表达式
        Scanner sc = new Scanner(System.in);
        System.out.println("手机号");
        String phonenum = sc.next();
        String patter = "1[35-9]\\d{9}";
        while (!phonenum.matches(patter)) {
            System.out.println("不正确");
            phonenum = sc.next();
        }
        String txt = "ZOU123VIP";
        String ss = txt.replaceAll("\\d", "*");
        System.out.println(ss);

        String txt2 = "How do you do?";
        String[] split = txt2.split("[ ?]");
        for (String s : split) {
            System.out.print(s);

        }
        System.out.println();
        System.out.println("-------------------------");

        StringBuilder sb = new StringBuilder();
        sb.append("啊喔额一屋鱼");
        sb.setCharAt(1, '2');
        sb.delete(0, 0);
        sb.insert(5, '9');
        System.out.println(sb);


    }

}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        Collator collator = Collator.getInstance(Locale.CHINESE);
        return collator.compare(this.name, o.name);
        //return this.age - o.age;
    }
}
