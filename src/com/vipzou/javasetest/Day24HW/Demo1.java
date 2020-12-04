package com.vipzou.javasetest.Day24HW;


import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String,String> map = new TreeMap<>();
        Map<String,String> map2 = new TreeMap();
        map2.put("今天（周三）","多云");
        map2.put("微风","23℃");
        map2.put("明天（周四）","雷阵雨转中雨");
        map2.put("微风","29～22℃");
        map2.put("后天（周五）","阴转多云");
        map2.put("微风","31～23℃");
        map2.put("大后天（周六）","多云");
        map2.put("微风","31～24℃");

        for (Map.Entry<String, String> stringStringEntry : map2.entrySet()) {
            map.put(stringStringEntry.getKey(),stringStringEntry.getValue());
            list.add(map);

        }
        System.out.println(map2);
        System.out.println(list);

    }

}
