package com.vipzou.javasetest.Day28;

/**
 * int getPriority()  返回线程 优先级
 * void setPriority(int newPriority)  设置线程优先级
 *  每个线程都有一个优先级, 在操作系统线程调度器选择执行哪个线程时, 会优先调度优先级别高 的线程
 *  Java中每个线程优先级都默认为5,  优先级取值范围是[1,10]
 *  存在问题:
 *          当很多个线程都需要等待调度器调度时, 可能会出现优先级别低的线程一直无法得到调度的情况, 称为线程饥饿
 * 动力节点
 * 2020/12/10
 */
public class Test05 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " --- Priority = " + Thread.currentThread().getPriority());
                }
            }
        };

        Thread t1 = new Thread(r, "t1     ");
        t1.setPriority(1);      //设置优先级

        Thread t2 = new Thread(r, "  t2   ");

        Thread t3 = new Thread(r,"      t3");
        t3.setPriority(10);     //设置优先级

        t1.start();
        t2.start();
        t3.start();
    }
}
