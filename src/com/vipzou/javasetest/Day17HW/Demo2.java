package com.vipzou.javasetest.Day17HW;
//随机生成100个小写字母保存到字符数组中,统计小写字母a出现的次数
//	int xx = (int)( Math.random() * 26 ) ;  	// 返回一个[0,26 )范围内的随机整数
//	char cc = (char)  ( ‘a’ + xx ) ; 		//小写字母
public class Demo2 {
    public static void main(String[] args) {
        int[] intArr = new int[100];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 100);
            System.out.println(intArr[i]);
        }
    }
}
