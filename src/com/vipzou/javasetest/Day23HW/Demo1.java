package com.vipzou.javasetest.Day23HW;

import jdk.nashorn.internal.ir.IfNode;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("体育课","赵四");
        map.put("美术课","老八");
        map.put("劳动课","Giao");
        if (map.containsKey("体育课")){
            System.out.println("体育课教师："+map.get("体育课"));
        }
        if (map.containsKey("劳动课")){
            System.out.println("有");
        }else {
            System.out.println("没有");
        }
        if (map.containsValue("FF")){

        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }

}
