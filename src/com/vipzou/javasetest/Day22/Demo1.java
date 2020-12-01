package com.vipzou.javasetest.Day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < 20) {
            int num = random.nextInt(100);
            if (!list.contains(num)) {
                list.add(num);
            }


        }
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
        System.out.print("\n"+list.remove(Integer.valueOf(77)));
        boolean b = false;
        for (Integer integer : list) {
            if ("66".equals(integer)) {
                b = true;
            }

        }
        if (b) {
            System.out.println("\n有");
        } else {
            System.out.println("\n没有");
        }
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next > 50) {
                iterator.remove();
            }

        }
        System.out.println(list);
    }
}
