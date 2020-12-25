package com.vipzou.javasetest.Day28;

/**
 * boolean isDaemon()  判断线程是否为守护线程
 * void setDaemon(boolean on)  设置线程为守护线程
 * 守护线程不能独立执行,当JVM中只有守护线程时, 守护线程会自动结束,JVM退出. 垃圾回收器就是一个典型的守护线程,守护线程专门为其他线程提供服务
 * 动力节点
 * 2020/12/10
 */
public class Test08 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println(Thread.currentThread().getName() + " --  " + i);
                }
            }
        });

        t.setDaemon(true);      //设置线程为守护线程. 注意需要在start()开启之前设置守护线程, 如果先start(),则t线程正常启动, 在调用setDaemon(true)时,就会产生异常,在main线程中设置守护线程,main线程出现了异常,main线程中断了
        t.start();

        //当前是main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main ==> "  + i);
        }
    }
}
