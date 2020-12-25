package com.vipzou.javasetest.Day28;

/**
 * static void yield()  线程让步, 正在执行的线程会释放CPU执行权,等待线程调度器重新调度
 * 动力节点
 * 2020/12/10
 */
public class Test12 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        long sum = 0 ;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
            Thread.yield();     //线程让步
        }
        System.out.println( "sum==" + sum);

        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - begin));
    }
}
