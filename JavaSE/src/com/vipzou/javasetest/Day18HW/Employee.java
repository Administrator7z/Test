package com.vipzou.javasetest.Day18HW;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }




    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }


    @Override
    public int compareTo(Employee o) {

        return this.name.compareTo(o.name);
    }
}
