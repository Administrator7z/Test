package com.vipzou.javasetest.Day23;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("resources/xxx.properties");
        properties.load(in);
        properties.getProperty("zh");
        properties.getProperty("mm");
        in.close();

    }

}
