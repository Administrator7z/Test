package com.vipzou.javasetest.Day30.Test;

public class Test {
    public static void main(String[] args) {
        MyStorage storage = new MyStorage();
        for (int i = 0; i < 3; i++) {
            new ProducerThread("生产者",storage).start();
        }
        for (int i = 0; i < 3; i++) {
            new ConsumerThread("消费者",storage).start();
        }

    }
}
