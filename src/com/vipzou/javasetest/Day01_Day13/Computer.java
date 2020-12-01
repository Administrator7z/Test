package com.vipzou.javasetest.Day01_Day13;

public class Computer {
    private String brand;
    private String colour;
    private double price;
    private double size;

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public Computer(String brand, String colour, double price, double size) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
