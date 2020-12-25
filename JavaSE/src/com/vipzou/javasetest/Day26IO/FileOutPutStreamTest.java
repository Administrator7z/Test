package com.vipzou.javasetest.Day26IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {
    public static void main(String[] args) {
        copyFile("E:\\abc.txt", "E:\\abcd.txt");


    }

    private static void m1() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\abc.txt", true);
            byte[] bytes = "嘻嘻嘻嘻嘿嘿嘿嘿".getBytes();
            fos.write('\r');
            fos.write('\n');
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(String s1, String s2) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(s1);
            fos = new FileOutputStream(s2);
//            int[] ints = new int[fis.available()];
            int bb = fis.read();
            System.out.println(fis.available());
 //           int x = 0;
            while (bb != -1) {
//                ints[x] = bb;
                bb = fis.read();
//                x++;
                fos.write(bb);
            }
//            for (int anInt : ints) {
//                fos.write(anInt);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
