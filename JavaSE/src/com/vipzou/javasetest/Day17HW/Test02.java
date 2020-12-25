package com.vipzou.javasetest.Day17HW;

/**
 * 随机生成100个小写字母保存到字符数组中,统计小写字母a出现的次数
 * 	int xx = (int)( Math.random() * 26 ) ;  	// 返回一个[0,26 )范围内的随机整数
 * 	char cc = (char)  ( ‘a’ + xx ) ; 		//小写字母
 * 动力节点
 * 2020/11/26
 */
public class Test02 {
    public static void main(String[] args) {
        //1) 定义存储100个字符的数组
        char[] chars = new char[100];

        //2) 给数组所有元素赋值随机小写字母
        for (int i = 0; i < chars.length; i++) {
            int xx = (int)( Math.random() * 26 ) ;  	// 返回一个[0,26 )范围内的随机整数
            char cc = (char)( 'a' + xx ) ; 		//把xx转换为小写字母
            chars[i] = cc;
        }
        for (char aChar : chars) {
            System.out.print( aChar + "  ");
        }
        System.out.println();

        //3)统计a出现的次数
        int count = 0 ; //定义计数器变量
        //遍历chars数组中所有的字符, 如果这个字符是a则count加1
        for (char cc : chars) {
            if ( cc == 'a'){
                count++;
            }
        }
        System.out.println("a的次数:" + count);

        System.out.println("------------------------------------");
        //统计 chars数组中每个字符出现的次数, 可以把每个小写字母的次数保存到一个数组中
        int  [] countArr = new int[26];     //定义长度为26的整数数组,用来保存每个小写字母的次数,刚刚new出来一个数组后, 数组的元素每个元素默认初始化为0
        //约定, a的次数保存到countArr[0]元素中, b的次数保存到countArr[1]元素中, c的次数保存到countArr[2]元素中, d的次数保存到countArr[3]元素中, ......    z的次数保存到countArr[25]元素中,

        //遍历chars数组的每个字符,如果该字符是a则countArr[0]元素的值加1, 如果该字符是b则countArr[1]元素的值加1, 如果该字符是c则countArr[2]元素的值加1, 如果该字符是z则countArr[25]元素的值加1,
        // 对于任意一个字符cc, 它的次数保存到 countArr[ cc-'a' ] 元素中
        for (char cc : chars) {
            countArr[ cc - 'a'] ++;
        }

        //打印结果, 从'a'遍历到'z'
        for( char cc = 'a' ;  cc <= 'z'; cc++){
            System.out.println( cc + "字母出现的次数: " + countArr[cc-'a']);
        }

        char cc = 'a';  //系统为cc变量分为2个字节存储空间, 这块存储空间中存储的是'a'字符的码值97
        cc++ ;    //相当于 cc=(char)(cc+1);
    }
}
