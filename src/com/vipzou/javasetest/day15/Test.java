package com.vipzou.javasetest.day15;

import java.util.Scanner;

/**
 * 测试类中没有使用多态完成计算总租金
 * 动力节点菲菲
 * 2020/11/19
 */
public class Test {
    public static void main(String[] args) {
        //第一步：键盘输入要租赁的车，存放在变量中
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要租赁的车：(1.Car 2.Bus)");
        int num = input.nextInt();
        //第二步：根据输入变量num中的值进行判断
        switch (num){
            case 1: //表示小轿车
                //创建小轿车对象
                Car c = new Car();
                System.out.println("总租金：" + c.getSumRent(1));
                break;
            case 2: //表示大巴车
                //创建大巴车对象
                Bus b = new Bus();
                System.out.println("总租金：" + b.getSumRent(2));
                break;
            default:
                System.out.println("编号输入有误!");
                break;
        }
    }
}
