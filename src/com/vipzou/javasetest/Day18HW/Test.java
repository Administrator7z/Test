package com.vipzou.javasetest.Day18HW;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        company.add(new Employee());
        company.add(new Employee());
        System.out.println(company.show());
        company.judge("啊啊");
        company.del("啊啊");


    }
}
