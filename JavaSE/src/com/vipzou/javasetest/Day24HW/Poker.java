package com.vipzou.javasetest.Day24HW;


public class Poker implements Comparable<Poker> {
    String numArr;
    String colorArr;
    int keyNum;

    public Poker(String daXiao, String huaSe, int keyNum) {
        this.numArr = daXiao;
        this.colorArr = huaSe;
        this.keyNum = keyNum;
    }

    @Override
    public String toString() {
        return
                numArr
                        + colorArr
                ;
    }



    @Override
    public int compareTo(Poker o) {
        //Collator collator = Collator.getInstance(Locale.CHINESE);
//        Map<String, Integer> rules = Demo2.rules;
        // return collator.compare(this.daXiao,o.daXiao);
        return this.keyNum - o.keyNum;
    }
}
