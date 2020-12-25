package com.vipzou.javasetest.Day28;

/**
 * static Thread currentThread()  返回当前线程
 * Java中任意一段代码都执行在某个线程当中, 执行这条语句的线程就是当前线程
 * 动力节点
 * 2020/12/10
 */
public class Test02 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();  //是main线程执行这一条语句,当前线程就是main线程
        System.out.println( currentThread );    //Thread[main,5,main]. 打印thread对象会调用toString()方法, 返回 "Thread[" + 线程名称 + "," + 线程优先级 + "," + 线程分组名称 + "]"

        SubThread t = new SubThread();  //在main线程 new出来一个SubThread对象,在main线程调用SubThread()构造方法,
        t.start();

    }

    static class SubThread extends Thread{
        public SubThread(){
            System.out.println("构造方法中当前线程:" + Thread.currentThread());
        }

        @Override
        public void run() {
            System.out.println("run方法体中的当前线程: " + Thread.currentThread());  //子线程启动后, 会自动执行run方法, 即run方法体是由开启的子线程来执行的
        }
    }
}
