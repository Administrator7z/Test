package com.vipzou.javasetest.dy01_dy14;

public class Student {
    private int studentNumber;
    private String studentName;
    private int studentAge;
    private char studentSex;
    private Grade studentClass;

    public Student() {
    }

    public Student(int studentNumber, String studentName, int studentAge, char studentSex, Grade studentClass) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学生学号=" + studentNumber +
                ", 学生姓名='" + studentName + '\'' +
                ", 学生年龄=" + studentAge +
                ", 学生性别=" + studentSex +
                ", 学生年级名称=" + (studentClass == null ? null : studentClass.getClassName()) +
                ", 学生年级地址=" + (studentClass == null ? null : studentClass.getClassAddress()) +

                '}';
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(char studentSex) {
        this.studentSex = studentSex;
    }

    public Grade getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Grade studentClass) {
        this.studentClass = studentClass;
    }
}
