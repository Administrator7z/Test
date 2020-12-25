package com.vipzou.Dao;


import com.vipzou.Entity.Dept;
import com.vipzou.Util.JdbcUtil;
import com.vipzou.Util.ReflectUtil;

import java.sql.PreparedStatement;

public class DeptDao {
    //insert
    public int insert(Dept dept)throws Exception{
        String sql = null;
        PreparedStatement car = null;
        JdbcUtil util = new JdbcUtil();
        int flag =0;
        try {
            sql = ReflectUtil.createInsert(dept);
            car = util.getCar(sql);
            flag =car.executeUpdate();
        } finally {
            util.close();
        }
        return flag;
    }

    //update
    public int update(Dept dept)throws Exception{
        String sql = null;
        PreparedStatement car = null;
        JdbcUtil util = new JdbcUtil();
        int flag =0;
        try {
            sql = ReflectUtil.createUpdate(dept,"deptno");
            car = util.getCar(sql);
            flag =car.executeUpdate();
        } finally {
            util.close();
        }
        return flag;
    }
}
