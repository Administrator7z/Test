package com.vipzou.javasetest.day01_day13;

public class Demo05 {
    private String model;
    private String brand;
    private double price;

    public Demo05() {
    }

    public Demo05(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Demo3{" +
                "型号='" + model + '\'' +
                ", 品牌='" + brand + '\'' +
                ", 价格='" + price + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
