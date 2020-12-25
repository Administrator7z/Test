package com.vipzou.javasetest.Day15;


public abstract class Vehicle {

    String id;
    String brand;

    public Vehicle() {
    }

    public Vehicle(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public abstract double getSumRent(int days);
}
