package com.vipzou.javasetest.Day28;

/**
 * String getName()  返回线程名称
 * void setName(String name)  设置线程名称
 * 动力节点
 * 2020/12/10
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println( Thread.currentThread().getName() );     //main
        //设置线程名称
        Thread.currentThread().setName("主线程");
        System.out.println( Thread.currentThread().getName() );     //主线程

        //给Runnable接口引用赋值匿名内部类对象,称为创建Runnable任务
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " --- " + Thread.currentThread().getId());
                }
            }
        };

        //创建线程对象后,线程名称默认为 Thread-0, Thread-1......
        Thread t1 = new Thread(r);
        //在new出来t1线程时, 没有指定线程名称,先默认为thread-0, 下一行又修改为t1
        t1.setName("t1");
        t1.start();

        new Thread(r).start();      //Thread-1

        //也可以在创建线程的同时就给线程名称赋值
        new Thread(r, "子线程").start();

        new Thread(r).start();      //Thread-2
    }
}
