package com.vipzou.javasetest.Day29;

public class Test0 {
    private final static Object  obj = new Object();
    public static void main(String[] args) {

        Test0 tt = new Test0();
        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                tt.sm();
            }
        }),"t1");
        Thread t2 = new Thread((new Runnable() {
            @Override
            public void run() {
                new Test0().sm();
            }

        }),"t2");
        t1.start();
        t2.start();

    }
    public void sm (){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() + "------------------" + i);
            }
        }


        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() +  "------" + i);

            }
        }
    }
}
