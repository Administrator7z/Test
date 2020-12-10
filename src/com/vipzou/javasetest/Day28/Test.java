package com.vipzou.javasetest.Day28;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
//创建线程第三种方式
public class Test {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new Prime());
        Thread t = new Thread(task);
        t.start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
class Prime implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        int x = new Random().nextInt(100);
        return x;
    }
}
