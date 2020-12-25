package com.vipzou.test;

import com.vipzou.Entity.Dept;
import com.vipzou.Util.JdbcUtil;
import com.vipzou.Util.ReflectUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        JdbcUtil util = new JdbcUtil();
        String sql="select * from dept";
        PreparedStatement car = util.getCar(sql);
        ResultSet table = car.executeQuery();
        List<Dept> list = ReflectUtil.convertData(table, Dept.class);
        for(Dept dept:list){
            System.out.println("部门编号 "+dept.getDeptno()+" 部门名称 "+dept.getDname()+"部门位置 "+dept.getLoc());
        }
    }
}
