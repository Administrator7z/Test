package com.vipzou.javasetest.Day17HW;
//定义方法, 实现数组中各个元素的乱序, 遍历数组的每个元素,把该元素与另外一个随机下标的元素进行交换交换
public class Demo3 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50};
        Demo3.random(intArr);
        for (int i : intArr) {
            System.out.println(i);
        }
    }

    private static int[] random(int[] intArr) {

        for (int j = 0; j < intArr.length; j++) {

            while (true) {
                int a = (int) (Math.random() * 100);
                if (a <= intArr.length - 1) {
                    if (j == a) {
                        return intArr;

                    }

                    intArr[j] = intArr[a] + intArr[j];
                    intArr[a] = intArr[j] - intArr[a];
                    intArr[j] = intArr[j] - intArr[a];

                }

            }

        }


        return intArr;


    }
}