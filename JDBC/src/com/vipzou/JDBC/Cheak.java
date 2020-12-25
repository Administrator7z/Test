package com.vipzou.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Cheak {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String url = "jdbc:mysql://localhost:3306/test";
        String sqlUser = "root";
        String sqlPassword = "123";
        String sql = "select count(*) from emp where ename = ? and empno = ?";
        int flag = 0;
        Connection con = null;
        PreparedStatement car = null;
        ResultSet table = null;
        try {
            con = DriverManager.getConnection(url, sqlUser, sqlPassword);
            car = con.prepareStatement(sql);
            car.setString(1, username);
            car.setString(2, password);
            table = car.executeQuery();
            table.next();
            flag = table.getInt(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (table != null){
                    table.close();

                }
                if (car != null){
                    car.close();
                }
                if (con != null){}
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (flag == 0 ){
            System.out.println("滚蛋");
        }else {
            System.out.println("欢迎");
        }

    }
}
