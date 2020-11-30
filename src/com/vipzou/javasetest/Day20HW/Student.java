package com.vipzou.javasetest.Day20HW;

public class Student implements Comparable<Student> {
    private int stuNum;
    private String name;
    private int grade;


    public Student() {
    }

    public Student(int stuNum, String name, int grade) {
        this.stuNum = stuNum;
        this.name = name;
        this.grade = grade;
    }

    public int getStuNum() {
        return stuNum;
    }

    public Student setStuNum(int stuNum) {
        this.stuNum = stuNum;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public double getGrade() {
        return grade;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.grade - this.grade;
    }
}
