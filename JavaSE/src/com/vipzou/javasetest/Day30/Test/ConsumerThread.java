package com.vipzou.javasetest.Day30.Test;

public class ConsumerThread extends Thread{
    private MyStorage storage;

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
