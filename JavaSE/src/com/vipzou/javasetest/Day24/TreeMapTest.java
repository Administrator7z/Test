package com.vipzou.javasetest.Day24;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        treeMap.put("e大哥",99);
        treeMap.put("d二哥",98);
        treeMap.put("c三哥",95);
        treeMap.put("b四哥",97);
        treeMap.put("a五哥",96);
        System.out.println(treeMap);
        Map<String,Integer> treeMap2 = new TreeMap<>();
        treeMap2.putAll(treeMap);
        System.out.println(treeMap2);
        System.out.println(treeMap2);


    }
}
