package com.vipzou.javasetest.Day22;

import com.vipzou.javasetest.Day20HW.Student;

import java.util.HashSet;
import java.util.Iterator;
/*
奥
 */
public class LinkedLIstTest {
    public static void main(String[] args) {

        //List<String> list = new LinkedList<>();
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(10, "法外狂徒张三", 100));
        set.add(new Student(10, "美食届里我老八", 100));
        System.out.println(set);

        for (Iterator<Student> iterator = set.iterator(); iterator.hasNext(); ) {
            Student next = iterator.next();


        }


    }
}
