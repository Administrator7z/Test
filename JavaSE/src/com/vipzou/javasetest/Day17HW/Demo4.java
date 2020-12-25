package com.vipzou.javasetest.Day17HW;
//定义方法把整数数组的元素逆序 , 第0个元素与length-1元素交换,第1个元素与length-2交换
public class Demo4 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50,};
        Demo4.randmo(intArr);
        for (int i : intArr) {
            System.out.println(i);

        }
    }

    private static int[] randmo(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (i == (intArr.length - 1) / 2) {
                return intArr;
            }
            intArr[i] = intArr[i] + intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] = intArr[i] - intArr[intArr.length - 1 - i];
            intArr[i] = intArr[i] - intArr[intArr.length - 1 - i];

        }
        return intArr;
    }
}
