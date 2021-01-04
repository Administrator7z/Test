package com.vipzou.dao;

import com.vipzou.entity.Dept;
import com.vipzou.util.JdbcUtil;
import com.vipzou.util.ReflectUtil;

import java.sql.PreparedStatement;
import java.util.List;

public class DeptDao {
    JdbcUtil util = new JdbcUtil();
    public  int insert (Dept dept) throws Exception {
        String sql = null;
        int result = 0;
        sql = ReflectUtil.createInsert(dept);
        try {
            result = util.executeUpdate(sql);

        } finally {
            util.close();
        }
        return result;
    }
    public List<Dept> findAll () throws  Exception{
        String sql = "select * from dept ";

        return   util.executeQuery(sql, Dept.class);



    }
    public  int deptDelete (String deptNo) throws  Exception{
        int result = 0;
        String sql = "delete from dept where deptno = ?";
        PreparedStatement  car =null;
        try {
            car = util.getCar(sql);
            car.setString(1,deptNo);
            result = car.executeUpdate();
        } finally {
            util.close();
        }
        return result;


    }
}
