package com.vipzou.javasetest.Day28;

/**
 * long getId()  返回线程的id. 创建线程之后, 每个线程都有唯一 的id,这是系统自动分配的, 不能修改 , 这个id主要用于区分不同的线程,在实际开发中,经常通过线程名称来区分
 *
 * 动力节点
 * 2020/12/10
 */
public class Test03 {
    public static void main(String[] args) {
        //开启10个线程
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {

                    }
                }
            }).start();
        }

        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println( thread.getId() + " ---------- " + thread);
        }
        /*
            程序运行后,可能会出现空指针异常, 当程序执行到第22行时,活动线程的数量假设还有6个
            第23行把活动线程都复制到数组中
            当执行第24行foreach循环时, 其中一个线程已经结束了, 即threads数组中有一个元素为null了 执行第25行可能会产生空指针 异常
         */
    }
}
