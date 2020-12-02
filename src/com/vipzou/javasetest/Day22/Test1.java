package com.vipzou.javasetest.Day22;

import java.util.*;

public class Test1 {
    private static Object Data1;

    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("aa");
        c1.add("bb");
        c1.add("cc");
        c1.add("dd");
        c1.add("ee");
        Collection c2 = new ArrayList(c1);
        c2.addAll(c1);
        System.out.println(c2);
        System.out.println(c2.containsAll(c1));
        System.out.println(c2.retainAll(c1));
        c2.removeAll(c1);
        System.out.println(c2);

        System.out.println("-------------------------------");
        List<String> list =  new ArrayList<>();
        list.add("aa");        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.set(2, "aa");
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            System.out.println(next);
        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf("aa"));
        System.out.println(list.lastIndexOf("aa"));
        System.out.println(list.get(0));


        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next+"\t");

        }
        while (listIterator.hasPrevious()){
            String previous =listIterator.previous();
            System.out.println(previous + "\t");

        }


        List<String>  sublist = list.subList(0, 2); //sublist仅查看修改
        System.out.println("------------------------------------");
        String [] s1 = new String[list.size()];
        list.toArray(s1);   //把list中的元素复制到s1数组当中 两个独立的

        //Arrays.asList(); //可以把数组转换为List集合, 注意,这仅仅是提供了一种通过List集合查看数组元素的形式
        List<String> asList = Arrays.asList(s1);////可以把数组转换为List集合
        System.out.println(Arrays.toString(s1));



    }
}
