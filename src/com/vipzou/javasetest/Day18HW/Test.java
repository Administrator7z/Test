package com.vipzou.javasetest.Day18HW;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        company.add(new Employee("哈哈", 11, 2000));
        company.add(new Employee("QQ", 42, 2000));
        company.add(new Employee("问问", 50, 2000));
        company.add(new Employee("嗯嗯", 22, 2000));
        company.add(new Employee("让人", 33, 2000));
        company.add(new Employee("头疼", 44, 2000));
        company.add(new Employee("原因", 5, 2000));
        company.add(new Employee("uu", 6, 2000));
        company.add(new Employee("IIS", 88, 2000));
        company.add(new Employee("谢谢", 34, 2000));
        company.add(new Employee("谢谢", 45, 2000));
        company.paiXu();

        // company.paiXu();


        //System.out.println(company.show());
//        company.judge("啊啊");
        //company.del("啊啊");


    }
}
