package com.vipzou.javasetest.Day22HW;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};

        List<String> qqList = new ArrayList<>();
//        for (String qq : strs) {
//            if (!qqList.contains(qq)) {
//                qqList.add(qq);
//            }
//
//        }
        List<String> asList = Arrays.asList(strs);
        Set<String> set = new HashSet<>(asList);
        qqList.addAll(set);


        System.out.println(qqList);


    }

}
