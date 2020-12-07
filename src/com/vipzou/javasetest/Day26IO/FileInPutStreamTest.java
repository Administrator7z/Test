package com.vipzou.javasetest.Day26IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInPutStreamTest {

    public static void main(String[] args) {

        m1();
        //m2();


    }

    private static void m1()  {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\abc.txt");
            System.out.println(fis.available());   //查看可读取字节数
            int bb = fis.read();
            while (bb != -1) {
                System.out.print((char) bb+"\t");
                bb = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void m2() {
        try (FileInputStream fis = new FileInputStream("E:\\abc.txt")) {
            int bb = fis.read();
            while (bb != -1) {
                System.out.print((char) bb);
                bb = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
