package com.vipzou.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "SafeFilter",value = "/*")
public class SafeFilter implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession  session = null;
        HttpServletRequest request = (HttpServletRequest) req; //肥水不留外人田
        String uri = null;


        //1.与登录验证资源（login.html,LoginServlet）相关请求应该无条件放行
        uri = request.getRequestURI() ; // "/网站名/资源文件名"
        if(uri.indexOf("login")!=-1){
            chain.doFilter(request, resp);
             return;
        }


        //2.通过拦截的请求对象，向tomcat索要当前来访者的私人储物柜
        session = request.getSession(false);
        if(session!=null){
            if( session.getAttribute("key")!=null){
                chain.doFilter(request, resp);
                return;
            }

        }

        //2.代替tomcat拒绝用户请求
        request.getRequestDispatcher("/login_error.html").forward(request, resp);
    }



}
