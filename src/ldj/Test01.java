package ldj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* 已知有十六支男子足球队参加2023 北京世界杯。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数
男足参赛国家：
科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
*/
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("科特迪瓦");
        list.add("阿根廷");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        List<Integer> num = new ArrayList<>();
        Collections.shuffle(list);
        int j = 0;
        for (int i = 1; i <5 ; i++) {
            System.out.println("第"+i+"支球队");
            for (int x = 1 ; x <=4 ; x++,j++) {
                System.out.println(list.get(j));

            }


        }

//        Random random = new Random();


    }
}
