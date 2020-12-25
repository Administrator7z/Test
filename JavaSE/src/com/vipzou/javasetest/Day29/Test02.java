package com.vipzou.javasetest.Day29;

public class Test02 {
    public static void main(String[] args) {
        MyValue myValue = new MyValue("lisi", "123");
        new Thread(new Runnable(){
            @Override
            public void run() {

                    myValue.set("wangwu", "456");

            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                myValue.getValue();
            }
        }).start();


    }
}

class MyValue {
    private String name;
    private String password;

    public MyValue(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public  void set(String name, String password){
        this.name = name;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
    }

    public void getValue() {
        System.out.println(name + ":" + password);

    }
}
