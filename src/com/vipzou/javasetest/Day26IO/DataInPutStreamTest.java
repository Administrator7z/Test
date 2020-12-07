package com.vipzou.javasetest.Day26IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInPutStreamTest {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\abce.txt"));
        //注意:  读取的顺序要与写入的顺序一致
        int ii = dis.readInt();
        double dd = dis.readDouble();
        char cc = dis.readChar();
        boolean bb = dis.readBoolean();
        String ss = dis.readUTF();

        dis.close();

        System.out.println( ii );
        System.out.println( dd );
        System.out.println( cc );
        System.out.println( bb );
        System.out.println( ss );
    }
}
