package com.vipzou.javasetest.Day31;

import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        ResourceBundle bundle = ResourceBundle.getBundle("resources/config");
        String classname = bundle.getString("classname");
        Class cla = Class.forName(classname);
        int mod = cla.getModifiers();
        System.out.println(Modifier.toString(mod));

        }
    }

