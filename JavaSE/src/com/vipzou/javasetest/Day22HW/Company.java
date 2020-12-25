package com.vipzou.javasetest.Day22HW;


import java.util.Arrays;
import java.util.Comparator;

public class Company {
    public static void main(String[] args) {

    }

    Employee[] employees = new Employee[20];
    int size;

    public void add(Employee employee) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("输入姓名，年龄，工资");
        //employee.setName(sc.next()).setAge(sc.nextInt()).setSalary(sc.nextDouble());
        employees[size++] = employee;

    }


    public void paiXu() {
        Arrays.sort(employees, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
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

    public boolean judge(String name) {
        if (name != null) {
            for (int i = 0; i < size; i++) {
                if (name.equals(employees[i].getName())) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (employees[size].getName() == null) {
                    return true;
                }

            }
        }


        return false;
    }

    public boolean del(String name) {

        for (int i = 0; i < size; i++) {
            if (name.equals(employees[i].getName())) {
                Employee[] newEmployees = new Employee[employees.length - 1];

                System.arraycopy(employees, 0, newEmployees, 0, i);
                System.arraycopy(employees, i + 1, newEmployees, i, newEmployees.length - i);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
