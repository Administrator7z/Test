package com.vipzou.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "insert into dpet vlaues(?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com.xxx.test", "root", "123");
            con.setAutoCommit(false);

            ps = con.prepareStatement(sql);
            for (int i = 0; i < 100; i++) {
                ps.setInt(1, i);
                ps.setString(2, "dept_"+i);
                ps.setString(3, "北京");
                ps.addBatch();
            }
            try {
                con.commit();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                con.rollback();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            if (ps != null){
                ps.close();

            }
            if (con != null){
                con.close();
            }
        }




    }
}
