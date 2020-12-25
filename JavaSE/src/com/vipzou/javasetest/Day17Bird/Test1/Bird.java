package com.vipzou.javasetest.Day17Bird.Test1;

/**
 * 把各种颜色的小鸟抽象为Bird类
 * 动力节点
 * 2020/11/24
 */
public abstract class Bird {
    //小鸟有飞行的操作, 但是不同颜色小鸟飞行方式 不同, 即在小鸟类中有飞行的功能,无法具体实现,这个功能可以定义为抽象方法
    public abstract void fly();
}

class RedBird extends Bird{
    @Override
    public void fly() {
        System.out.println("红火正常飞行 ");
    }
}
class BlueBird extends Bird{
    @Override
    public void fly() {
        System.out.println("蓝冰可以裂变为三个");
    }
}
class YellowBird extends Bird{
    @Override
    public void fly() {
        System.out.println("黄风可以加速");
    }
}

