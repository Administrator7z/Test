package com.vipzou.javasetest.Day27IO;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) {
        //read();
//        writer();
//        writer2();
        writeData();


    }

    private static void writeData() {
        try (
                FileWriter fw = new FileWriter("D:\\powernode\\第一阶段\\Test01.java",true);
                BufferedWriter bw = new BufferedWriter(fw);
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                ){
                String lin = br.readLine();
                while (!"quit".equalsIgnoreCase(lin)){
                    bw.write(lin);
                    bw.newLine();
                    lin = br.readLine();
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writer2() {
        try (
                FileOutputStream fos = new FileOutputStream("D:\\powernode\\第一阶段\\Test01.java",true);
                OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
                ){
            osw.write("???");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void writer() {
        try (FileInputStream fis = new FileInputStream("D:\\powernode\\第一阶段\\Test01.java");
             InputStreamReader osw = new InputStreamReader(fis,"UTF-8");
        ) {
            int read = osw.read();
            while ( read != -1){
                System.out.println((char)read);
                read = osw.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\powernode\\第一阶段\\Test01.java");

            char[] chars = new char[1024 * 8];
            int read = fr.read(chars);
            while (read != -1) {
                System.out.println(String.valueOf(chars, 0, read));
                read = fr.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
