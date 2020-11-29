package com.vipzou.javasetest.Day20HW;

public class Student implements Comparable<Student> {
    private int stuNum;
    private String name;
    private double grade;


    public Student() {
    }

    public Student(int stuNum, String name, double grade) {
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

    public Student setGrade(double grade) {
        this.grade = grade;
        return this;
    }



    @Override
    public int compareTo(Student o) {
        return (int) (o.grade - this.grade);
    }
}
