package com.vipzou.javasetest.Day28;

/**
 * 活动线程就是调用start()方法之后 , 线程还没有结束之前就处于活动状态
 * static int activeCount()  返回活动线程的数量
 * boolean isAlive() 判断线程是否为活动线程
 * 动力节点
 * 2020/12/10
 */
public class Test01 {
    public static void main(String[] args) {

        System.out.println("11 ----------- " + Thread.activeCount() );  //2, 分别是main线程, 还有垃圾回收器

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t1 == " + i+ " ~~~~~~~~~~ " + Thread.activeCount());
                }
                //当main线程结束后, 如果还有其他线程处于活动状态时,JVM会启动另外一个线程DestroyJavaVM
                Thread[] threads = new Thread[Thread.activeCount()];
                //把当前所有的线程复制到数组中
                Thread.enumerate(threads);
                for (Thread thread : threads) {
                    System.out.println(thread);
                }
            }
        });

        System.out.println("22 ----------- " + Thread.activeCount() ); //2

        t1.start();
        System.out.println("33 ----------- " + Thread.activeCount() );  //3

        for (int i = 0; i < 100; i++) {
            System.out.println("main --" + i + " t1.isAlive: " + t1.isAlive());
        }
        System.out.println("44 ----------- " + Thread.activeCount() );

    }
}
