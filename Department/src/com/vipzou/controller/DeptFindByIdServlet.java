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

@WebServlet(name = "DeptFindByIdServlet",value="/dept/findById")
public class DeptFindByIdServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String deptNo = null;
        DeptDao dao = new DeptDao();
        Dept dept = null;
        PrintWriter out = null;
        //1.调用请求对象读取请求头中参数信息，得到部门编号
        deptNo = request.getParameter("deptNo");
        //2.调用DAO对象推送查询命令
        try {
            dept = dao.findById(deptNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3.调用响应对象将处理结果写入到响应体
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        out.print("<form action='/myWeb/dept/update'>");
        out.print("<table border=2 align=center>");
        out.print("<tr>");
        out.print("<td>部门编号</td>");
        out.print("<td><input type='text' readOnly name='deptNo' value='" + dept.getDeptNo() + "'></td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>部门名称</td>");
        out.print("<td><input type='text' name='dname' value='" + dept.getDname() + "'></td>");


        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>部门位置</td>");
        out.print("<td><input type='text' name='loc' value='" + dept.getLoc() + "'></td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td><input type='submit' value='更新部门'></td>");
        out.print("<td><input type='reset' value='重置'></td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("</form>");

    }
}
