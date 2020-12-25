package com.vipzou.javasetest.Day24HW;


import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new TreeMap<>();
        map.put("date", "今天（周三）");
        map.put("weather", "多云");
        map.put("wind", "微风");
        map.put("temperature", "23℃");
        //把map添加到list中
        list.add(map);

        map = new HashMap<>();  //创建一个新的map
        //向map中添加数据
        map.put("date", "明天（周四）");
        map.put("weather", "雷阵雨转中雨");
        map.put("wind", "微风");
        map.put("temperature", "29～22℃");
        //把map添加到list中
        list.add(map);

        map = new HashMap<>();  //创建一个新的map
        //向map中添加数据
        map.put("date", "后天（周五）");
        map.put("weather", "阴转多云");
        map.put("wind", "微风");
        map.put("temperature", "31～23℃");
        //把map添加到list中
        list.add(map);

        map = new HashMap<>();  //创建一个新的map
        //向map中添加数据
        map.put("date", "大后天（周六）");
        map.put("weather", "多云");
        map.put("wind", "微风");
        map.put("temperature", "31～24℃");
        //把map添加到list中
        list.add(map);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            map = list.get(i);
            sb.append("\t{\n");
            int entryCount = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\t\t" + entry.getKey() + " : \"" + entry.getValue() + "\"");
                entryCount++;   //每遍历一个Entry,计数器就加1
                //键值对之间使用逗号分隔
                if (entryCount < map.size()) {
                    sb.append(",");
                }
                sb.append("\n");
            }

            sb.append("\t}");
            //map之间使用逗号 连接
            if (i < list.size() - 1) {
                sb.append(",");
            }

            sb.append("\n");
        }
        sb.append("]\n");
        System.out.println(sb);

    }

}


