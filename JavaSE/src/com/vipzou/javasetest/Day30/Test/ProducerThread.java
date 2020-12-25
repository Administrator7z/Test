package com.vipzou.javasetest.Day30.Test;

import java.util.Random;

public class ProducerThread extends  Thread{
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
