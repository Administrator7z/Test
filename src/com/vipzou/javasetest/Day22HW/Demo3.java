package com.vipzou.javasetest.Day22HW;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        List<String> list = Arrays.asList(strs);
        System.out.println(list);
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            if (iterator.hasNext()){
                iterator.remove();
            }

        }
        System.out.println(list);
    }

}
