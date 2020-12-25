package com.vipzou.javasetest.Day29HW;

import java.util.Random;

/**
 * 使用多线程模拟多窗口售票
 * 动力节点
 * 2020/12/12
 */
public class Test {

    //定义静态变量保存座位号,作为多个线程的共享数据
    private static int no = 1;
    private static final  int MAX = 100;    //总的座位数
    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        //定义卖票的任务
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized ( OBJ ) {
                        //判断是否还有余票
                        if ( no > 100 ){
                            System.out.println("票已卖完");
                            return;
                        }
                        System.out.println(Thread.currentThread().getName() + " 出售: Ticket--" + no);
                        no++;
                    }

                    //通过睡眠模拟打印车票的时间
                    try {
                        Thread.sleep(new Random().nextInt(5));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //创建三个线程模拟三个窗口售票
        for (int i = 0; i < 3; i++) {
            new Thread(r, "窗口-" + (i+1)).start();
        }
    }
}
