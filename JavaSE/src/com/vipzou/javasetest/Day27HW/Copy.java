package com.vipzou.javasetest.Day27HW;


import java.io.*;


public class Copy {
    public static void main(String[] args) {
        copyFolder2("C:\\Z\\截图工具", "D:");
        //listSubFiles("F:");
    }
    private static void copyFolder2(String srcFolder, String destFoleder) {
        //不存在不需要复制
        File srcDir = new File(srcFolder);
        if (!srcDir.exists()){
            return;

        }
        //目标不存在创建文件夹
        File destDir = new File(destFoleder);
        if (!destDir.exists()){
            destDir.mkdirs();
        }
        //如果srcFoler是一个文件 不复制
        if (srcDir.isFile()){
            return;
        }
        if (destDir.isFile()){
            return;
        }
        //遍历源文件内容
        File[] files = srcDir.listFiles();
        for (File srcFile : files) {
            File destFile = new File(destFoleder,srcFile.getName());
            if (srcFile.isFile()){
                copy(srcFile.toString(), destFile.toString());
            }else{
                copyFolder2(srcFile.getAbsolutePath(), destFile.getAbsolutePath());
            }

        }

    }

    private static void copyFolder(String s1, String s2) {


        File f = new File(s1);
        StringBuilder sb = new StringBuilder(s1);
        if (f.isDirectory()) {

            int i = sb.lastIndexOf("\\");
            s2 = s2 + "\\" + sb.substring(i + 1, sb.length());
            File f2 = new File(s2);
            f2.mkdir();
            File[] files = f.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (!file.isDirectory()) {
                        copy(file.toString(), s2 + "\\" + file.getName());
                    }

                    if (file.isDirectory())
                    {
                        copyFolder(file.toString(), s2 + "\\" + file.getName());


                    }

                }

            }
        } /*else if (!f.isDirectory()) {
            int i = sb.lastIndexOf("\\");
            s2 = s2 + "\\" + sb.substring(i + 1, sb.length());
            File f2 = new File(s2);
            f2.mkdir();
            copy(s1, s2);

        }*/


    }

    private static void copy(String s1, String s2) {

        try (
                FileInputStream fis = new FileInputStream(s1);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(s2);
                BufferedOutputStream bos = new BufferedOutputStream(fos);) {

            int bb = bis.read();
            while (bb != -1) {
                bb = bis.read();
                bos.write(bb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //显示目标所有文件
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
