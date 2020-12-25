package com.vipzou.JDBC.Test;

import com.vipzou.JDBC.Dao.Dept;
import com.vipzou.JDBC.Entity.DeptDao;


import java.util.List;

public class Test {
    public static void main(String[] args) throws  Exception{
        DeptDao dD = new DeptDao();
        List<Dept> deptLIst= null;
        deptLIst = dD.selectAll();
        for (Dept dept : deptLIst) {
            System.out.println(dept.getDeptno()+dept.getDname()+dept.getLoc());
        }
        dD.delete(22);


    }
}
