package com.vipzou.Dao;


import com.vipzou.Entity.Dept;
import com.vipzou.Util.JdbcUtil;
import com.vipzou.Util.ReflectUtil;

import java.sql.PreparedStatement;
import java.util.List;

public class DeptDao {
    //insert
    public int insert(Dept dept)throws Exception{
        String sql = null;

        JdbcUtil util = new JdbcUtil();
        int flag =0;
        try {
            sql = ReflectUtil.createInsert(dept);
            flag = util.executeUpdate(sql);
        } finally {
            util.close();
        }
        return flag;
    }

    //update
    public int update(Dept dept)throws Exception{
        String sql = null;
        JdbcUtil util = new JdbcUtil();
        int flag =0;
        try {
            sql = ReflectUtil.createUpdate(dept,"deptno");
            flag = util.executeUpdate(sql);
        } finally {
            util.close();
        }
        return flag;
    }
    public int delete(String deptNo) throws  Exception{
        String sql ="delete from dept where deptno =?";
        PreparedStatement car = null;
        JdbcUtil util = new JdbcUtil();
        int flag = 0;
        try {
            car = util.getCar(sql);
            car.setString(1,deptNo);
        } finally {
            util.close();
        }
        return flag;

    }
    public List findAll()throws  Exception{
        String sql = "selecr * from dept";
        JdbcUtil util = new JdbcUtil();
        List<Dept> deptList = null;
        deptList = util.executeQuery(sql,Dept.class);
        return deptList;
    }
}
