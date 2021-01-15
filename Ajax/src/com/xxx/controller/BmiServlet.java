package com.xxx.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BmiServlet",value = "/bmi")
public class BmiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String myname = request.getParameter("myname");
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        String res=myname+",";

        double bmi = weight/(height * height);
        if(bmi < 18.5){
            res+="您当前的体过轻，请注意增加肉！";
        }else if(bmi >=18.5 && bmi <= 23.9){
            res+="您当前的体正常，请注意保持！";
        }else if(bmi >=24 && bmi <= 27){
            res+="您当前的体过重，请注意增加运动量！";
        }else if(bmi >27 && bmi <= 32){
            res+="您当前的体重处于肥胖状态，请注意增加运动量，并减少饮食！";
        }else{
            res+="您当前的体重处于非常肥胖状态，您自己看的办吧，我没有建议了，反正说了您也不会听！";
        }

        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(res);
        printWriter.flush();
        printWriter.close();

    }
}
