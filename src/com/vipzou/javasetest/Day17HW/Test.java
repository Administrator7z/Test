package com.vipzou.javasetest.Day17HW;

import java.util.Scanner;

/**
 * 从键盘上输入年和月,打印该月的日历
 * 动力节点
 * 2020/11/26
 */
public class Test {
    public static void main(String[] args) {
        //1) 从键盘上输入年和月
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年和月");
        int year = sc.nextInt();
        int month = sc.nextInt();

        //2 )打印该月的日历
        printCalendar(year, month);
    }

    //定义方法打印某年某月的日历
    private static void printCalendar(int year, int month) {
        //year = 2020  month = 12
        //日历包括两部分,第一行打印表头, 从第二行开始打印该月的数字
        //1) 打印表头
        System.out.println("一\t二\t三\t四\t五\t六\t日\t");

        //2) 打印本月的数字
        //2.1 需要确定这个月有多少天
        int monthDays = getMonthDays(year, month);

        //2.2 需要确定本月的1号是星期几,即从哪个位置开始打印
        int weekday = getWeekday(year, month, 1);

//       打印时每7个数字需要换行,定义一个计数器变量
        int count = 0 ;

        //2.3 在打印时, 得先打印第一行前面的空白, 如果weekday是2前面打印1个空白,如果weekday是5则前面需要打印4个空白
        for( int i = 1; i < weekday; i++){
            System.out.print("\t");
            count++;    //第一行的空白也需要计数
        }

        //2.4 再接着打印本月的数字,
        for(int d = 1; d <= monthDays ; d++){
            System.out.print(d + "\t");
            count++;    //打印的数字也需要计数
            //判断是否需要换行
            if (count % 7 == 0 ){
                System.out.println();
            }
        }

    }

    /**
     * 定义方法返回指定日期是星期几
     *
     * @param year  年
     * @param month 月
     * @param day   日
     * @return 返回1表示星期一, 返回2表示星期二,返回3表示星期三.....返回6表示星期六,返回7表示星期日
     */
    private static int getWeekday(int year, int month, int day) {
        //已知:1900-1-1是星期一, 计算year-month- day是星期几,就计算从1900-1-1 到 year-month-day 总共经过了多少天, 总天数对7求余,余数可以作为星期几
        int sum =0;     //定义变量计算总天数
        //先累加整年的天数,[1900, year)
        for(int i = 1900;  i < year; i++){
            //累加第i年的天数,闰年366天,平年365天
            sum += leap(i) ? 366 : 365;
        }

        //再累加year这一年整月的天数[1,month)
        for(int i = 1; i < month; i++){
            //累加第i月的天数
            sum += getMonthDays(year, i);
        }

        //最后累加year这一年,month这一月的天数
        sum += day;

        //总天数对7求余
        int r = sum % 7;
        //r余数为0表示星期日,需要修正为7
        return  r == 0 ? 7 : r;
    }

    //定义方法判断指定月份的天数
    private static int getMonthDays(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (leap(year)){
                    return 29;
                }else {
                    return 28;
                }
        }
        return 0;
    }

    //定义方法判断是否闰年
    private static boolean leap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }

}
