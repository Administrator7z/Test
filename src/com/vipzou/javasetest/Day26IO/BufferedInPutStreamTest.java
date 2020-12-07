package com.vipzou.javasetest.Day26IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInPutStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bis = new BufferedInputStream(fis);
        int bb = 0;
        try {
            bb = bis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while ( bb != -1){
            System.out.println((char) bb);
            try {
                bb = bis.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
