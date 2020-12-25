package com.vipzou.javasetest.Day17Bird.Test1;

/**
 * 定义弹弓类
 * 动力节点
 * 2020/11/24
 */
public class Slingshot {
    //弹弓有弹射操作,可以把各种颜色小鸟给弹射出去, 弹射方法需要的小鸟通过参数来接收,参数可以接收各种颜色小鸟, 参数可以定义为Bird父类类型,形参是父类引用,在调用时,可以传递各种子类对象,这是对象自动向上转型
    public void shoot(Bird bird){
        //在方法体中,弹弓把小鸟弹射出去之后 ,是小鸟在飞
        bird.fly();
    }
}
