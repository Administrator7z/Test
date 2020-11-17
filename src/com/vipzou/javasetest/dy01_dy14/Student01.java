package com.vipzou.javasetest.dy01_dy14;

public class Student01 {
    private String name;
    private int age;
    private char sex;

    public Student01() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 35) {
            this.age = age;
        } else {
            this.age = 19;
        }

    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == '男' || sex == '女') {
            this.sex = sex;
        } else {
            this.sex = '女';
        }

    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
