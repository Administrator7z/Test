package com.vipzou.javasetest.Day28;

/**
 * static void sleep(long millis)  线程睡眠millis毫秒
 * 动力节点
 * 2020/12/10
 */
public class Test10 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            System.out.println("main ---> " + i  + " --- " + System.currentTimeMillis());
            //每次循环体中 打印完字符串后,让线程睡眠2秒
            Thread.sleep(2000);     //单位是毫秒
        }
    }
}
