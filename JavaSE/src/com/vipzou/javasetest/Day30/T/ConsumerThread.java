package com.vipzou.javasetest.Day30.T;

/**
 * 动力节点
 * 2020/12/12
 */
public class ConsumerThread extends Thread {
    //指定从哪个仓库中取数据
    private MyStorage storage ;

    public ConsumerThread(String name, MyStorage storage) {
        super(name);
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            storage.take();
        }
    }
}
