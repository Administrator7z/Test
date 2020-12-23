package com.vipzou.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCTest {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        String sql = "insert into dept (deptno,dname,loc) values(22,'项目组','丰台')";
        int flag = 0;
        Connection con = null;
        PreparedStatement car = null;
        con = DriverManager.getConnection(url, user, password);

        car = con.prepareStatement(sql);

        flag = car.executeUpdate();
        if (car != null) {
            car.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("插入 " + flag + "行数据");
    }

}
