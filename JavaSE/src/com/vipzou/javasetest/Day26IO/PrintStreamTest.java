package com.vipzou.javasetest.Day26IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        //1)建立流通道
        PrintStream printStream = new PrintStream(new FileOutputStream( "d:/course/03-javase进阶/log.txt", true ) );
//        PrintStream printStream = new PrintStream("d:/course/03-javase进阶/log.txt" );

        //2)打印
        printStream.print("把数据打印到log.txt文件中,不换行");
        printStream.println("打印完后会换行");
        printStream.println("这就是第二行");

        //System.out就是PrintStream打印流, System.out代表系统的标准输出设备(显示器 ), 会把数据打印到屏幕上
        System.out.println("这一行会把数据打印到屏幕上");
        PrintStream old = System.out;   //原来的
        //修改System.out的打印方向
        System.setOut(printStream);
        System.out.println("这一行就不在屏幕上显示了,而是会打印到log.txt文件中");
        //
        System.setOut(old);
        System.out.println("又打印到屏幕上了");


        try {
            byte[] gbks = "hello动力节点".getBytes("GBKK");
        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();    //在屏幕上打印异常信息
            e.printStackTrace(printStream);     //会把异常信息打印log.txt文件中
        }

        //3)关闭
        printStream.close();
    }
}
