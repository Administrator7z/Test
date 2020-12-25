package com.vipzou.javasetest.Day30.T;

/**
 * 动力节点
 * 2020/12/12
 */
public class Test {
    public static void main(String[] args) {
        //先创建仓库
        MyStorage storage = new MyStorage();

        //创建3个生产者线程
        for (int i = 0; i < 3; i++) {
            new ProducerThread("+++++++生产者"+ i, storage).start();
        }
        //创建3个消费者线程
        for (int i = 0; i < 3; i++) {
            new ConsumerThread("消费者" + i, storage).start();
        }
    }
}
