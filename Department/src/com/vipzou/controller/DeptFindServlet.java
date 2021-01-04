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
import java.util.List;

@WebServlet(name = "DeptFindServlet", value = "/dept/find")
public class DeptFindServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DeptDao dao = new DeptDao();
        List<Dept> all = null;
        try {
            all = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>部门编号</td>");
        out.print("<td>部门名称</td>");
        out.print("<td>部门位置</td>");
        out.print("<td colspan=2 align=center>操作</td>");
        out.print("</tr>");
        if (all != null && all.size() > 0) {

            for (Dept dept : all) {
                out.print("<tr>");
                out.print("<td>" + dept.getDeptNo() + "</td>");
                out.print("<td>" + dept.getDname() + "</td>");
                out.print("<td>" + dept.getLoc() + "</td>");
                out.print("<td><a href='/myWeb/dept/delete?deptNo=" + dept.getDeptNo() + "'>删除部门</a></td>");
                out.print("<td><a href='/myWeb/dept/findById?deptNo=" + dept.getDeptNo() + "'>详细信息</a></td>");
                out.print("</tr>");
            }
        }
        out.print("</table>");
    }


}

