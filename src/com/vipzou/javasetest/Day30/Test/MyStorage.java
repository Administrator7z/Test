package com.vipzou.javasetest.Day30.Test;

import java.util.ArrayList;
import java.util.List;

public class MyStorage {
    private List list = new ArrayList();
    private final static int MAX = 10;
    
    public synchronized void add(Object data){
        while (list.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(data);
        System.out.println(Thread.currentThread().getName() + " 存储了数据: " + data + ",现在仓库容量为: " + list.size());
        this.notifyAll();
    }
    public synchronized void take(){
        while (list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object removed = list.remove(0);
        System.out.println(Thread.currentThread().getName() + "消费了数据:" + removed + "后,容量为:" + list.size());
        this.notifyAll();
    }
    
}
