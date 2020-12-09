package com.vipzou.javasetest.Day27HW;

import java.util.Objects;

public class Commodity {
    private Integer id;
    private String name;
    private Integer price;
    private Integer salesVolume;

    public Commodity() {
    }

    public Commodity(Integer id, String name, Integer price, Integer salesVolume) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.salesVolume = salesVolume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", salesVolume=" + salesVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
