package com.vipzou.Dao;


import com.vipzou.Entity.Dept;
import com.vipzou.Util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {
    public int insert(Dept dept) throws Exception {
        String sql = "insert into dept vlaue(?,?,?)";
        JdbcUtil util = new JdbcUtil();
        int flag = 0;
        try {
            util.getcon();
            PreparedStatement car = util.getCar(sql);
            car.setInt(1, dept.getDeptno());
            car.setString(2, dept.getDname());
            car.setString(3, dept.getLoc());
            flag = car.executeUpdate();
        } finally {
            util.close();
        }
        return flag;

    }

    public int update(Dept dept) throws Exception {
        String sql = "update dept set dname=?,loc=? where deptno=? ";
        JdbcUtil util = new JdbcUtil();
        int flag = 0;
        try {
            util.getcon();
            PreparedStatement car = util.getCar(sql);
            car.setInt(3, dept.getDeptno());
            car.setString(1, dept.getDname());
            car.setString(2, dept.getLoc());
            flag = car.executeUpdate();
        } finally {
            util.close();

        }

        return flag;
    }

    public int delete(Integer deptno) throws Exception {
        String sql = "delete from dept where deptno=?";
        JdbcUtil util = new JdbcUtil();
        int flag = 0;
        try {
            util.getcon();
            PreparedStatement car = util.getCar(sql);
            car.setInt(1, deptno);
            flag = car.executeUpdate();
        } finally {
            util.close();

        }

        return flag;
    }

    public List selectAll() throws Exception {
        String sql = "select * from dept";

        List list = new ArrayList();
        ResultSet table = null;
        
        JdbcUtil util = new JdbcUtil();
        try {
            util.getcon();
            PreparedStatement car = util.getCar(sql);

            table = car.executeQuery();
            while (table.next()) {
                int deptNo = table.getInt("deptNo");
                String dname = table.getNString("dname");
                String loc = table.getNString("loc");
                Dept dept = new Dept(deptNo, dname, loc);
                list.add(dept);
            }
        } finally {

            util.close(table);
            

        }
        return list;

    }
}
