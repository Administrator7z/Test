package com.vipzou.javasetest.Day30.T;

import java.util.Random;

/**
 * 动力节点
 * 2020/12/12
 */
public class ProducerThread extends Thread {
    //生产了数据放在哪个仓库中
    private MyStorage storage;

    public ProducerThread(String name, MyStorage storage) {
        super(name);
        this.storage = storage;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            storage.add( random.nextInt(100) );
        }
    }
}
