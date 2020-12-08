package com.vipzou.javasetest.Day27IO;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

/*        if (f1.exists()){
            f1.delete();
        }
        f1.createNewFile();
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(f1.getParent());
        long freeSpace = f1.lastModified();
        System.out.println(new Date(freeSpace));*/

        //listSubFiles("C:\\");
        //del("C:\\新建文件夹");
        search("C:\\新建文件夹","123.txt");


    }

    private static void search(String folder, String name) {
        File f1 = new File(folder);
        File[] files = f1.listFiles();
        if (files != null){
            for (File file : files) {
                if (file.isFile() && file.getName().contains(name)){
                    System.out.println(file);
                }else {
                    search(file.getAbsolutePath(), name);
                }

            }
        }

    }

    private static void del(String folder) {
        File f1 = new File(folder);
        if (f1.isDirectory()){
            File[] files = f1.listFiles();
            for (File file : files) {
                del(file.getAbsolutePath());
            }
        }
        f1.delete();


    }

    public static void listSubFiles(String folder) {
        File f1 = new File(folder);
        File[] files = f1.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
                if (file.isDirectory()) {
                    listSubFiles(file.getAbsolutePath());
                }
            }
        }
    }

}


