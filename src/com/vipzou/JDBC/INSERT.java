package com.vipzou.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class INSERT {


    public static void main(String[] args)throws Exception {
        String user="root";
        String password="123";
        String url="jdbc:mysql://localhost:3306/test" ;  //资源定位地址
        String sql="insert into dept (deptno,dname,loc) values(19,'浦发银行项目组2','顺义')";
        int flag =0;
        Connection con = null; //连接通道管理对象
        PreparedStatement car = null;//交通工具管理对象

        //1.通过DriverManager调用Driver接口实现类建立一个连接通道
        con= DriverManager.getConnection(url,user,password);

        //2.通过Connection接口实现类在连接通道上创建一个交通工具
        car =con.prepareStatement(sql);

        //3.通过PreparedStatement接口实现类控制交通工具将SQL推送到指定的MySql服务器上执行并带回处理结果
        flag = car.executeUpdate();

        //4.销毁资源
        if(car!=null){
            car.close();//自裁
        }
        if(con!=null){
            con.close();//
        }

        System.out.println("本次插入 "+flag+"行数据");

    }
}
