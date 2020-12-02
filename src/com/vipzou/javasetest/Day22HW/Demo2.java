package com.vipzou.javasetest.Day22HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> footballTeam = new ArrayList<>();
        Random random = new Random();
        while (footballTeam.size() < 16) {
            Integer a = random.nextInt(16);
            if (footballTeam.contains(a)) {
                continue;
            } else {
                footballTeam.add(a);
            }
        }
        System.out.println(footballTeam);
    }

}
