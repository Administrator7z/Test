package com.vipzou.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
    Connection con = null;
    PreparedStatement car = null;
    public Connection getcon() throws Exception{
        String url = "jdbc:mysql://localhost:3306/com.xxx.test";
        String user = "root";
        String password = "123";

        con = DriverManager.getConnection(url, user, password);
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
}
