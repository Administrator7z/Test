package com.vipzou.javasetest.Day23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("www", 1000);
        map.put("aaa", 2000);
        map.put("sss", 3000);
        map.put("ddd", 5000);
        System.out.println(map);
        map.put("aaa", 10000);
        System.out.println(map);
        map.replace("www", 20000);
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

    }
}


