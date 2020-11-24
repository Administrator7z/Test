package com.vipzou.javasetest.day15;

public class Bus extends Vehicle{

    int seat;
    public Bus() {
    }

    public Bus(String id, String brand, int seat) {
        super(id, brand);
        this.seat = seat;
    }

    @Override
    public double getSumRent(int days) {

        if(this.seat <= 16){
            return 400 *days;
        }else{
            return 600 * days;
        }
    }



}
