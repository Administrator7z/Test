package com.vipzou.javasetest.Day26IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutStreamTest {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\abc.txt"));
        //2)写入数据
        dos.writeInt(123);
        dos.writeDouble(3.14);
        dos.writeChar('汉');
        dos.writeBoolean(false);
        dos.writeUTF("写入字符串");
        //把数据写入文件后,直接使用文本编辑器打开会显示乱码, 该文件中数据需要使用DataInputStream流读取

        //3)关闭流
        dos.close();
    }
}
