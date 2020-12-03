package com.vipzou.javasetest.Day23HW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        String sb = "daassadfasffafklasjfkalsjfkjskfjaskjgfjhaghjklasfhjklasjfsjfsal";
        String[] chars = sb.split("");
        char[] chars1 = sb.toCharArray();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.replace(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        System.out.println(map.entrySet());


        System.out.println(sb.indexOf(97));

    }
}
