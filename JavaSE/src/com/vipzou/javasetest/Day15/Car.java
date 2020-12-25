package com.vipzou.javasetest.Day15;

public class Car extends Vehicle{

    String type;

    public Car() {
    }

    public Car(String id, String brand, String type) {
        super(id, brand);
        this.type = type;
    }

    @Override
    public double getSumRent(int days) {

        if("两厢".equals(this.type)){
            return 300 * days;
        }else if("三厢".equals(this.type)){
            return 350 * days;
        }else{
            return 500 * days;
        }
    }
}
