package com.vipzou.javasetest.Day28;

public class Test00 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t1.start();
        a t2 = new a();
        t2.start();
        a.currentThread().setName("牛逼的a");
        System.out.println(a.currentThread().getId());
        System.out.println(a.currentThread().getName());
        System.out.println(a.activeCount());
        System.out.println(a.currentThread());
        System.out.println(Thread.currentThread());
    }

}
class a extends Thread{
    @Override
    public void run() {
        System.out.println(123);
    }
}

