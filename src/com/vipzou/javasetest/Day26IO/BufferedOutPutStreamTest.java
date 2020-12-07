package com.vipzou.javasetest.Day26IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\abce.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = "??????????????".getBytes();
        try {
            bos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
