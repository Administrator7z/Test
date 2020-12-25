package com.vipzou.javasetest.Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);
        Collections.reverse(list); //逆序
        System.out.println(list);
        Collections.shuffle(list); //乱序
        System.out.println(list); //排序
        Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        list.sort((o1, o2) ->  o1.compareTo(o2));

        list.sort(Comparator.naturalOrder()); //列表排序
        System.out.println(list);

    }
}
