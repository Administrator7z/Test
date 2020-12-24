package com.vipzou.JDBC;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) throws  Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        String sql = "select * from dept";
        Connection con = null;
        con = DriverManager.getConnection(url, user, password);
        PreparedStatement car = null;
        car = con.prepareStatement(sql);
        ResultSet table = null;
        table = car.executeQuery();
        ResultSetMetaData rsmd = table.getMetaData();
        int columnCount = rsmd.getColumnCount();
        System.out.println(columnCount);
        while (table.next()){
            int deptno = table.getInt("deptno");
            String dname = table.getNString(2);
            String loc = table.getNString(3);
            System.out.println(deptno+" "+dname+" "+loc);
        }
        if (table != null){
            table.close();
        }
        if (car != null){
            car.close();
        }
        if (con != null){
            con.close();
        }





    }
}
