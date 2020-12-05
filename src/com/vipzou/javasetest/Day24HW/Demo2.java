package com.vipzou.javasetest.Day24HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {
        String[] numArr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colorArr = {"♥", "♦", "♠", "♣"};
        int size = 0;
        List<Poker> pokerList = new ArrayList<>();
        //List<String> pokeList = new ArrayList<>();
        for (String s : numArr) {
            for (String s1 : colorArr) {
                pokerList.add(new Poker(s, s1, size));
                // pokeList.add(s1+s);
            }
            size++;
        }

        //System.out.println(pokeList);

        pokerList.add(new Poker("大王", "红", 17));
        pokerList.add(new Poker("小王", "黑", 16));
        //System.out.println(pokerList.size());
        List<List<Poker>> all = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            all.add(new ArrayList());
        }
        Random random = new Random();
//        for (int i = 0; i < pokerList.size() ; i++) {
//            int a = (int) (Math.random()*pokerList.size());
//            String tmp = pokeList.get(i);
//            pokeList.set(i, pokeList.get(a));
//            pokeList.set(a, tmp);
//        Collections.swap(pokeList,i,a);
//        }
        for (List<Poker> list : all) {
            for (int i = 0; i < 17; i++) {
                int x = random.nextInt(pokerList.size());
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
