package com.vipzou.Util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class ReflectUtil {
    public static String createInsert(Object instace) throws Exception {
        Class classManager;
        classManager = instace.getClass();
        Field fieldArray[] = null;
        fieldArray = classManager.getDeclaredFields();
        String tableName = null;
        tableName = classManager.getSimpleName();
        StringBuffer columns = new StringBuffer("(");
        StringBuffer values = new StringBuffer("values(");
        StringBuffer sql = new StringBuffer("inster in to");
        for (Field field : fieldArray) {
            field.setAccessible(true);
            String filedName = field.getName();
            Object value = field.get(instace);
            if (value != null) {
                if (columns.toString().equals("(")) {
                    columns.append(",");
                    values.append(",");
                }
                columns.append(filedName);
                values.append("'");
                values.append(value);
                values.append("'");
            }

        }
        columns.append(")");
        values.append(")");


        sql.append(tableName);
        sql.append(columns);
        sql.append(values);
        System.out.println("sql = " + sql.toString());
        return sql.toString();


    }

    public static String createUpdate(Object obj, String primaryKey) throws Exception {
        Class classManager = null;
        Field fieldArray[] = null;
        StringBuffer columns = new StringBuffer("");
        StringBuffer where = new StringBuffer(" WHERE ");
        StringBuffer sql = new StringBuffer("UPDATE ");
        String tableName = null;

        classManager = obj.getClass();
        fieldArray = classManager.getDeclaredFields();

        tableName = classManager.getSimpleName();


        for (Field fieldManager : fieldArray) {
            fieldManager.setAccessible(true);
            String fieldName = fieldManager.getName();
            Object value = fieldManager.get(obj);

            if (value != null) {
                if (!fieldName.equalsIgnoreCase(primaryKey)) {
                    if (!columns.toString().equals("")) {
                        columns.append(",");
                    }
                    columns.append(fieldName);
                    columns.append("=");
                    columns.append("'");
                    columns.append(value);
                    columns.append("'");
                } else {

                    where.append(fieldName);
                    where.append("=");
                    where.append("'");
                    where.append(value);
                    where.append("'");
                }
            }
        }


        sql.append(tableName);
        sql.append(" SET ");
        sql.append(columns);
        sql.append(where);
        System.out.println("sql = " + sql.toString());
        return sql.toString();
    }
    //table:临时表 classManager:类.class
    public static List convertData(ResultSet table, Class classManager) throws Exception {
        ResultSetMetaData rsmd;
        Field fieldArray[] = null;
        List list = new ArrayList();
        rsmd = table.getMetaData();                    //rsmd 获取表结构
        fieldArray = classManager.getDeclaredFields(); //fieldArray 获取字段和类型
        int a = 0;
        while (table.next()) {
            Object instance = classManager.newInstance();  //创建对象
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String columnName = rsmd.getColumnName(i);     //表头 列名
                String value = table.getString(columnName);  //内容
                if (value != null) {
                    for (int j = 0; j < fieldArray.length; j++) {
                        Field fieldManager = fieldArray[j];
                        String fieldName = fieldManager.getName(); //类属性
                        String typeName = fieldManager.getType().getSimpleName(); //类属性类型
                        if (fieldName.equalsIgnoreCase(columnName)) {  //Dao类属性名和表头不分大小写比较
                            fieldManager.setAccessible(true);               //设置访问性，反射类的方法，设置为true就可以访问private修饰的东西，否则无法访问 //使用 setAccessible(true) 可以临时改变访问权限，就可以获取私有成员变量的值
                            if ("String".equalsIgnoreCase(typeName)) {
                                fieldManager.set(instance, value);
                            } else if ("Integer".equalsIgnoreCase(typeName)) {
                                fieldManager.set(instance, Integer.valueOf(value));
                            } else if ("Double".equals(typeName)) {
                                fieldManager.set(instance, Double.valueOf(value));
                            }
                            break;
                        }
                        a++;
                    }
                }
            }
            list.add(instance);
            System.out.println(a);
        }
    return list;

    }

}
