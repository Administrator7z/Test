package com.vipzou.javasetest.Day22HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        String[] teamArr = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚",
                "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯",
                "意大利"};
        List<String> allTeamsList = new ArrayList<>();
        allTeamsList.addAll(Arrays.asList(teamArr));
        List<List<String>> groupList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            groupList.add(new ArrayList<>());
        }
        Random random = new Random();
        for (List<String> group : groupList) {
            for (int i = 0; i < 4; i++) {
                int x = random.nextInt(allTeamsList.size());
                group.add(allTeamsList.remove(x));
            }
        }
        System.out.println(groupList);
    }

}
