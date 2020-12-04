package com.vipzou.javasetest.Day24;



public class Car {
    String brand;
    Integer price;
    String colour;

    public Car(String brand, Integer price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
