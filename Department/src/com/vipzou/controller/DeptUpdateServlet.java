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

@WebServlet(name = "DeptUpdateServlet")
public class DeptUpdateServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result =0;
        String dname,loc,deptNo;
        DeptDao dao = new DeptDao();
        Dept dept = null;
        PrintWriter out = null;
        //1.调用请求对象读取请求头参数信息,得到需要添加的部门信息
        deptNo = request.getParameter("deptNo");
        dname = request.getParameter("dname");
        loc = request.getParameter("loc");
        //2.调用DAO对象推送SQL并得到处理结果
        dept = new Dept(Integer.valueOf(deptNo), dname, loc);
        try {
            result = dao.update(dept);
        } catch (Exception e) {
            e.printStackTrace();
            result=-1;
        }
        //3.调用响应对象将结果写入到响应包中响应体
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result ==1){
            out.print("<font style='color:red;font-size:40px'>部门信息更新成功</font>");
        }else{
            out.print("<font style='color:red;font-size:40px'>部门信息更新失败</font>");
        }
    }
}
