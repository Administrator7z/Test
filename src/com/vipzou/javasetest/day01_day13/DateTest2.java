package com.vipzou.javasetest.day01_day13;

public class DateTest2 {
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

    public DateTest2 setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public DateTest2 setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getDay() {
        return day;
    }

    public DateTest2 setDay(int day) {
        this.day = day;
        return this;
    }
}
