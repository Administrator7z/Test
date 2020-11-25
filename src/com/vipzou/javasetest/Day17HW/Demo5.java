package com.vipzou.javasetest.Day17HW;
//定义方法,把整数数组的各个元素连接为一个字符串, 数组元素放在一对方括弧中,各个元素之间使用逗号分隔
//    int [] data = {11, 22, 33 ,44 };
//String txt = toString( data );
//txt输出为:  [ 11, 22, 33, 44 ]
public class Demo5 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50,};

        System.out.println(Demo5.toString(intArr));
    }

    private static StringBuilder toString(int[] intArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i=0;i<intArr.length;i++)
        {
            if(i!=intArr.length-1)
                sb.append(intArr[i]+" ,");
            else
                sb.append(intArr[i]+" ]");
        }
        return sb;


    }

}
