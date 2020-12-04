package com.vipzou.javasetest.Day24HW;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Poker implements Comparable<Poker>{
    String daXiao;
    String huaSe;
    int keyNum;

    public Poker(String daXiao, String huaSe) {
        this.daXiao = daXiao;
        this.huaSe = huaSe;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "daXiao='" + daXiao + '\'' +
                ", huaSe='" + huaSe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poker poker = (Poker) o;
        return Objects.equals(daXiao, poker.daXiao) &&
                Objects.equals(huaSe, poker.huaSe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daXiao, huaSe);
    }

    @Override
    public int compareTo(Poker o) {
        Collator collator = Collator.getInstance(Locale.CHINESE);
//        Map<String, Integer> rules = Demo2.rules;
        return collator.compare(this.daXiao,o.daXiao);
    }
}
