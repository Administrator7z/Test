package com.vipzou.javasetest.Day30.T;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义仓库类
 * 动力节点
 * 2020/12/12
 */
public class MyStorage {
    //仓库需要有容器存储数据
    private List list = new ArrayList<>();
    private static int MAX = 10;    //仓库最大容量

    //向仓库中存储数据
    public synchronized void add( Object data){
        //1) 判断仓库是否已满 ,如果仓库满了, 等待
        while ( list.size() == MAX ){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //2) 存储数据
        list.add(data);
        System.out.println(Thread.currentThread().getName() + " 存储了数据: " + data + ",现在仓库容量为: " + list.size());
        System.out.println(Thread.currentThread().getName() + " 存储了数据: " + data + ",现在仓库容量为: " + list.size());


        //3) 通知消费者消费
        this.notifyAll();
    }

    //从仓库中取数据
    public synchronized void take(){
        //1)判断仓库是否已空, 如果仓库已空则等待
        while ( list.size() == 0 ){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //2)取数据
        Object removed = list.remove(0);
        System.out.println(Thread.currentThread().getName() + "消费了数据:" + removed + "后,容量为:" + list.size());

        //3) 通知生产者生产
        this.notifyAll();

    }
}
