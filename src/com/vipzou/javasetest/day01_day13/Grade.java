package com.vipzou.javasetest.day01_day13;

public class Grade {
    private int classNumber;
    private String className;
    private String classAddress;

    public Grade() {

    }

    public Grade(int classNumber, String className, String classAddress) {
        this.classNumber = classNumber;
        this.className = className;
        this.classAddress = classAddress;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassAddress() {
        return classAddress;
    }

    public void setClassAddress(String classAddress) {
        this.classAddress = classAddress;
    }
}
