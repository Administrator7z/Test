package com.vipzou.javasetest.Day23;

import com.vipzou.javasetest.Day20HW.Student;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student(01, "yi", 10));
        treeSet.add(new Student(02, "er", 20));
        treeSet.add(new Student(03, "san", 30));
        treeSet.add(new Student(05, "si", 5));
        treeSet.add(new Student(06, "wu", 6));
        for (Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------");
        Student stu  = new Student(07,"qi",20);
        treeSet.add(stu);
        //stu.setGrade(20);
        for (Student student : treeSet) {
            System.out.println(student);

        }
        System.out.println(treeSet.contains(stu));

    }
}
