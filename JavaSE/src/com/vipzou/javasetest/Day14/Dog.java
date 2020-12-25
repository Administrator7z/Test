package com.vipzou.javasetest.Day14;

public class Dog extends Animal{
    char sex;


    public Dog(char sex) {
        this.sex = sex;
    }

    public Dog(String name, int age, double weight, char sex) {
        super(name, age, weight);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
