package com.vipzou.javasetest.Day24HW;

import java.util.*;

public class Demo2 {
    //public static Map<String, Integer> rules = new HashMap<String, Integer>();
    public static void main(String[] args) {
        String[] daXiao = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] huaSe = {"♥","♦","♠","♣"};
        List<Poker> pokerList = new ArrayList<>();
        for (String s : daXiao) {
            for (String s1 : huaSe) {
                pokerList.add(new Poker(s,s1));
            }
        }
        pokerList.add(new Poker("大王","红"));
        pokerList.add(new Poker("小王","黑"));
        System.out.println(pokerList.size());
        List<List<Poker>> all = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            all.add(new ArrayList());
        }
        Random random = new Random();
        for (List<Poker> list : all) {
            for (int i = 0; i < 17 ; i++) {
                int x =  random.nextInt(pokerList.size());
                list.add(pokerList.remove(x));
            }
        }
        Collections.sort(all.get(0));
        Collections.sort(all.get(1));
        Collections.sort(all.get(2));
        System.out.println(all.get(0));
        System.out.println(all.get(1));
        System.out.println(all.get(2));
        System.out.println(pokerList);




    }
}
