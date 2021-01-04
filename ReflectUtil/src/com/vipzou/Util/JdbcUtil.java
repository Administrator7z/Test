package com.vipzou.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class JdbcUtil {
    Connection con = null;
    PreparedStatement car = null;
    public Connection getcon() throws Exception{
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";

        con = DriverManager.getConnection(url,user,password);
        return con;
    }
    public PreparedStatement getCar(String sql) throws Exception{

        car  = getcon().prepareStatement(sql);
        return car;
    }
    public void close() throws Exception{
        if (car != null){
            car.close();
        }
        if (con != null){
            con.close();
        }
    }
    public void close(ResultSet table) throws Exception{

        if (table != null){
            table.close();
        }
        close();
    }
    //推送DML
    public int executeUpdate(String sql)throws Exception{

        return getCar(sql).executeUpdate();
    }

    //推送DQL
    public List executeQuery(String sql, Class classManager)throws Exception{
        ResultSet table = getCar(sql).executeQuery();
        List list = ReflectUtil.convertData(table, classManager);
        close(table);
        return list;
    }
}
