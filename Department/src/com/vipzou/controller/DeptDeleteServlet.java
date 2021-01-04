package com.vipzou.controller;

import com.vipzou.dao.DeptDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeptDeleteServlet", value = "/dept/delete")
public class DeptDeleteServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String detpNo = null;
        DeptDao dao = new DeptDao();
        PrintWriter out = null;
        int result = 0;
        detpNo = request.getParameter("deptNo");
        try {
            result = dao.deptDelete(detpNo);
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40px'>部门信息删除成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40px'>部门信息删除失败</font>");
        }

    }
}

