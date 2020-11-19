package com.vipzou.javasetest.dy01_dy14;

public class Date {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public Date setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public Date setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getDay() {
        return day;
    }

    public Date setDay(int day) {
        this.day = day;
        return this;
    }
}
