package com.vipzou.controller;

import com.vipzou.dao.DeptDao;
import com.vipzou.entity.Dept;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeptAddServlet",value = "/dept/add")
public class DeptAddServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int result = 0;
        String deptNo,dname,loc;
        //deptNo = request.getParameter("deptNo");
        dname = request.getParameter("dname");
        loc = request.getParameter("loc");
        Dept dept = new Dept(null,dname,loc);
        DeptDao dao = new DeptDao();
        try {
           result =  dao.insert(dept);
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        if (result == 1 ){
            writer.print("<font style='color:red;font-size:40px'>部门信息添加成功</font>");
        }else {
            writer.print("<font style='color:red;font-size:40px'>部门信息添加失败</font>");
        }


    }
}
