package com.vipzou.javasetest.dy01_dy14;

public class Demo07 {
    private String plateNumber;
    private String colour;
    private String brand;
    private double price;

    public Demo07() {
    }

    public Demo07(String plateNumber, String colour, String brand, double price) {
        this.plateNumber = plateNumber;
        this.colour = colour;
        this.brand = brand;
        this.price = price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Demo07{" +
                "plateNumber='" + plateNumber + '\'' +
                ", colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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
