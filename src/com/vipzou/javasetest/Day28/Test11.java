package com.vipzou.javasetest.Day28;

/**
 * interrupt() 会中断 sleep()睡眠
 * 动力节点
 * 2020/12/10
 */
public class Test11 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " ---- " + i + " --- interrupted: " + Thread.currentThread().isInterrupted() );
                    //当i==100时让子线程睡眠10秒,在run方法体中受检异常只能捕获处理
                    if ( i == 100 ){
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main ==> " + i);
        }
        t.interrupt();  //中断t线程
    }
    /*
        运行后,可能 的结果为:
            1) main线程先结束, 执行第31行修改了t线程中断标志为true. main线程已结束, 当t线程执行到i==100时, 会调用Thread.sleep()方法睡眠, sleep()方法检测到当前线程的中断标志为true,则sleep()不会进入睡眠状态,会抛出中断异常, 同时把中断标志还原为false
            2) t线程先执行到i==100,进入 睡眠状态, main线程执行完for循环后,把t线程给中断了, 会把t线程的睡眠给中断了, t线程会抛出异常, 同时把中断标志还原为false

     */
}
