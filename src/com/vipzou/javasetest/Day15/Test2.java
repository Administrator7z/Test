package com.vipzou.javasetest.Day15;

import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入要租赁的车：(1.Car 2.Bus)");
        int num = input.nextInt();
        Vehicle v = getVehicle(num);
        if (v != null) {
            System.out.println("总租金：" + v.getSumRent(1));
        }
    }
    public static Vehicle getVehicle(int num) {
        Vehicle v = null;
        switch (num) {
            case 1:
                v = new Car();
                break;
            case 2:
                v = new Bus();
                break;
            default:
                System.out.println("编号输入有误!");
                break;
        }
        return v;
    }
}
