package com.vipzou.controller;

import com.vipzou.dao.EmpDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("");
        String ename, empNo, ck;
        int result = 0;
        ename = request.getParameter("ename");
        empNo = request.getParameter("empNo");
        ck = request.getParameter("ck");
        EmpDao emp = new EmpDao();
        HttpSession session = null;

        if (!"".equals(ename) && !"".equals(empNo)) {
                try {
                    result = emp.login(ename, empNo);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            if (result == 1) {
                if (ck != null) {
                    Cookie card = new Cookie("key", "十天免登陆");
                    card.setMaxAge(60 * 60 * 24 * 10);
                    response.addCookie(card);
                }
                session = request.getSession();
                session.setAttribute("key", "令牌");

                request.getRequestDispatcher("/index.html").forward(request, response);

                return;
            }

        }
        Cookie[] cookies = null;
        cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("key".equals(cookie.getName())) {
                    session = request.getSession();
                    session.setAttribute("key", "令牌");
                    request.getRequestDispatcher("/index.html").forward(request, response);
                    return;
                }

            }
        }
        if (ename ==null && empNo == null && ck == null && "get".equalsIgnoreCase(request.getMethod())){
            request.getRequestDispatcher("/login.html").forward(request, response);
            return;
        }
        request.getRequestDispatcher("/login_error.html").forward(request, response);
        return;


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);    }
}
