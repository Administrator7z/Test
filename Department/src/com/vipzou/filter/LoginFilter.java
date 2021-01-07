//package com.vipzou.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter(filterName = "LoginFilter",value = "/*")
//public class LoginFilter implements Filter {
//
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpSession session = null;
//        HttpServletRequest request = (HttpServletRequest) req;
//        session = request.getSession();
//        Cookie cookie = null;
//        if (!"key".equals(cookie.getName())){
//            req.getRequestDispatcher("/login.htm").forward(req,resp);
//        }
//        if (session != null){
//             if (session.getAttribute("key") != null){
//                 chain.doFilter(req,resp);
//                 return;
//             }
//        }
//        req.getRequestDispatcher("/login_error.html").forward(req,resp);
//    }
//
//
//
//}
