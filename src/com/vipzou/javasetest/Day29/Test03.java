package com.vipzou.javasetest.Day29;

public class Test03 {
    private static final Object OBJ = new Object();
    static int num = 0;
    private static final int THREADSNUM = 5;

    public static void main(String[] args) {

        for (int i = 0; i < THREADSNUM; i++) {
            final int r = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        printNum(r);
                    }
                }
            }).start();

        }
    }


    private static synchronized void printNum(int a) {

        while (num % THREADSNUM != a) {
            try {
                Test03.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "----------" + num);
        num++;

        Test03.class.notifyAll();


    }
}