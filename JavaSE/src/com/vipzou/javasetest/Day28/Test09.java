package com.vipzou.javasetest.Day28;

/**
 * void join()  线程加入,合并
 *  当在A线程中需要使用B线程的执行结果时, 可以在A线程中加入B线程, 则A线程就会等待, 等到加入的B线程运行结束后,A线程再继续向下执行
 * 动力节点
 * 2020/12/10
 */
public class Test09 {
    static int s = 0;
    public static void main(String[] args) throws InterruptedException {
        //创建线程对s自增10000次
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    s++;
                }
            }
        });
        t.start();

        t.join();   //在main线程中加入t线程,main线程就等待,等到加入 的t执行完毕后main线程再继续向下执行

        //在main线程中打印t线程自增后, s变量的值
        System.out.println( s   );

    }
}
