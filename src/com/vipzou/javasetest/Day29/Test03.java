package com.vipzou.javasetest.Day29;

public class Test03 {
    private static final Object obj = new Object();
    static int s;
    public static void main(String[] args) {

        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    while (true) {
                        if (s %2 ==0){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName()+"----------"+s);
                        s++;
                    }


                }



            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    while (true) {
                        if (s %2 !=0){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName()+"----------"+s);
                        s++;
                    }

                }


                }


        });
        t0.start();
        t1.start();


    }






}
