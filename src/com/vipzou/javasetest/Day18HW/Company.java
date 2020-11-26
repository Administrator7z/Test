package com.vipzou.javasetest.Day18HW;


import java.util.Scanner;

public class Company {
    Employee[] employees = new Employee[10];
    int size = 0;

    public void add(Employee employee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名，年龄，工资");
        employee.setName(sc.next()).setAge(sc.nextInt()).setSalary(sc.nextDouble());
        employees[size++] = employee;

    }

    public String show() {
        String x = "";
        for (int i = 0; i < size; i++) {
            x += employees[i].getName() + "\t" + employees[i].getAge() + "\t" + employees[i].getSalary();
            if (i != size - 1) {
                x += "\n";
            }

        }
        return x;
    }

    public void judge(String name) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(name)) {
                System.out.println("存在");
            } else {
                System.out.println("不存在");
            }
        }
    }

    public void del(String name) {

        for (int i = 0; i < size; i++) {
            if (employees[i].equals(name)) {
                Employee[] newEmployees = new Employee[employees.length - 1];

                System.arraycopy(employees, 0, newEmployees, 0, i);
                System.arraycopy(employees, i + 1, newEmployees, i, newEmployees.length - i);
                System.out.println("删除成功");
            } else {
                System.out.println("不存在");
            }
        }
    }
}
