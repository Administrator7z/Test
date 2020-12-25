package com.vipzou.javasetest.Day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class DateTest {


    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ss = sdf.format(new Date());
        System.out.println(ss);

        String s1 = "2020年11月30日 12:00:00";
        sdf.applyPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.parse(s1));


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(dtf));


        Integer i1 = Integer.valueOf("123123123");
        System.out.println(i1);
        long ct = System.currentTimeMillis();


        Collection collection = new ArrayList();
        collection.add("?");
        collection.add("!");
        collection.add(".");
        boolean b = collection.contains("?");
        collection.remove(".");
        for (Object o : collection) {
            System.out.println(o);


        }
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();

            System.out.println(next);
        }
        Collection<String> cc = new ArrayList<>();

    }
}
