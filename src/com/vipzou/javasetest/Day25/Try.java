package com.vipzou.javasetest.Day25;

import java.io.UnsupportedEncodingException;

public class Try {
    public static void main(String[] args) {
        convertaaa("哈哈哈哈","GBBBK");
        
    }

    private static void convertaaa(String txt, String charsetName) {
        try {
            byte[] bytes = txt.getBytes(charsetName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
