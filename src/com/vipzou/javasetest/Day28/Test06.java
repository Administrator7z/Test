package com.vipzou.javasetest.Day28;

/**
 * void interrupt()  中断线程
 * static boolean interrupted()  判断线程的中断状态
 * boolean isInterrupted()  判断线程的中断状态
 *  每个线程都 有一个中断标志, interrupt()方法的作用就是把线程的中断标志修改为true
 *  静态方法interrupted() 返回线程的中断状态,如果为true,该方法还会把线程的中断标志还原为false
 *  实例方法isInterrupted()  判断线程的中断状态,不会还原
 *
 * 动力节点
 * 2020/12/10
 */
public class Test06 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " -- Thread.interrupted = " + Thread.interrupted());
                }
            }
        }, "t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " -- isInterrupted = " + Thread.currentThread().isInterrupted());
                }
            }
        }," t2  ");
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main==> " + i);
        }
        //在main线程循环结束 后,中断t1,t2
        t1.interrupt();
        t2.interrupt();

    }
}
