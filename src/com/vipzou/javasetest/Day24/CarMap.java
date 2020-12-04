package com.vipzou.javasetest.Day24;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CarMap {
    public static void main(String[] args) {
        TreeMap<Car,String> carMap = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.price-o1.price;
            }
        });
        carMap.put(new Car("Audi",29,"black"),"王");
        carMap.put(new Car("BMW",34,"black"),"李");
        carMap.put(new Car("Lexus",32,"black"),"邹");
        carMap.put(new Car("Benz",30,"black"),"张");
        carMap.put(new Car("QQ",8,"black"),"孙");
        for (Car car : carMap.keySet()) {
            if (car.price>100){
                System.out.println("有");
            }
        }
        for (Car car : carMap.keySet()) {
            if (car.price<10){
                carMap.remove(car);
            }

        }
        System.out.println(carMap);
        carMap.firstKey();

    }
}
