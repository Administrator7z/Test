package com.vipzou.javasetest.Day29HW;

import java.util.Random;

public class Demo {
    static int ticket = 20;
    private static final int THREADSNUM = 10;

    public static void main(String[] args) {


        for (int i = 1; i < THREADSNUM + 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        sell(new Random().nextInt(5) + 1);
                    }
                }
            }, "第[" + i + "]售票口").start();
        }
    }

    private static synchronized void sell(int i) {


        if (ticket < i || ticket == 0) {
            return;
        } else {
            System.out.print("当前剩余[" + ticket + "]张");
            ticket = ticket - i;
        }

        System.out.println(Thread.currentThread().getName() + "售出[" + i + "]张------>剩余[" + ticket + "]张");

    }
}
