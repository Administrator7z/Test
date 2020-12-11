package com.vipzou.javasetest.Day29;

public class Test00 {
    private static Object obj = new Object();
    static  int s;
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (obj){

                        s++;
                    }
                }
            }
        };
        Thread t1 = new Thread(r);

        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(s);
    }
}
