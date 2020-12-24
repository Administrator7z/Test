package com.vipzou.JDBC.Entity;

import com.vipzou.JDBC.Dao.Dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {
    public int insert(Dept dept) throws Exception {
        String sql = "insert into dept vlaue(?,?,?)";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        Connection con = null;
        PreparedStatement ps = null;
        int flag = 0;
        try {
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(sql);
            ps.setInt(1, dept.getDeptno());
            ps.setString(2, dept.getDname());
            ps.setString(3, dept.getLoc());
            flag = ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }

        }

        return flag;

    }

    public int update(Dept dept) throws Exception {
        String sql = "update dept set dname=?,loc=? where deptno=? ";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        Connection con = null;
        PreparedStatement ps = null;
        int flag = 0;
        try {
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(sql);
            ps.setInt(3, dept.getDeptno());
            ps.setString(1, dept.getDname());
            ps.setString(2, dept.getLoc());
            flag = ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }

        }

        return flag;
    }

    public int delete(Dept dept) throws Exception {
        String sql = "delete from dept where deptno=?";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        Connection con = null;
        PreparedStatement ps = null;
        int flag = 0;
        try {
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(sql);
            ps.setInt(1, dept.getDeptno());
            flag = ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }

        }

        return flag;
    }

    public List selectAll() throws Exception {
        String sql = "select * from dept";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123";
        List list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet table = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(sql);
            table = ps.executeQuery();
            while (table.next()) {
                int deptNo = table.getInt("deptNo");
                String dname = table.getNString("dname");
                String loc = table.getNString("loc");
                Dept dept = new Dept(deptNo, dname, loc);
                list.add(dept);
            }
        } finally {

            if (table != null) {
                table.close();
            }

            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }

        }
        return list;

    }
}
