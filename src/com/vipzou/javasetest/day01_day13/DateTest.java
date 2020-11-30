package com.vipzou.javasetest.day01_day13;

public class DateTest {
    public static void main(String[] args) {
        DateTest2 date = new DateTest2();
        date.setYear(1999).setMonth(10).setDay(20);
        System.out.println(date.toString());
    }
}
