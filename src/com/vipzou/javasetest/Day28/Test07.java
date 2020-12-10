package com.vipzou.javasetest.Day28;

/**
 * interrupt()中断线程,仅仅是把线程的中断标志修改为true,b子线程并没有结束
 * 可以在子线程中定期检查中断标志 ,如果为true就结束run方法, run方法结束了线程就结束了
 * 动力节点
 * 2020/12/10
 */
public class Test07 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " -- -- " + i );
                    if ( Thread.currentThread().isInterrupted()){
                        return; //结束run方法
                    }
                }
            }
        }, "t");
        t.start();

        //main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main==> " + i);
        }
        //中断t线程
        t.interrupt();
    }
}
