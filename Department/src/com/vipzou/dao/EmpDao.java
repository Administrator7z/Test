package com.vipzou.dao;

import com.vipzou.util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpDao {
    JdbcUtil util = new JdbcUtil();
    public  int login(String ename ,String empNo) throws  Exception{
        String sql = "select count(*) from emp where ename =?  and empNo = ?";
        PreparedStatement car = null;
        ResultSet table = null;
        int result = 0;
        try {
            car = util.getCar(sql);
            car.setString(1,ename);
            car.setString(2,empNo);
            table = car.executeQuery();
            table.next();
            result  = table.getInt(1);
        } finally {
            util.close(table);
        }
        return result;


    }

}
