package com.vipzou.javasetest.Day17Bird.Test1;

/**
 * 动力节点
 * 2020/11/24
 */
public class Test {
    public static void main(String[] args) {
        //创建弹弓对象
        Slingshot slingshot = new Slingshot();

        //调用shoot(Bird)方法,实参传递Bird子类对象
        slingshot.shoot(new RedBird());
        slingshot.shoot(new BlueBird());
        slingshot.shoot(new YellowBird());

        //方法形参是抽象类引用,实参除了传递子类对象外,还可以传递匿名内部类对象
        slingshot.shoot(new Bird() {
            @Override
            public void fly() {
                System.out.println("黑球可以爆炸");
            }
        });
    }
}
