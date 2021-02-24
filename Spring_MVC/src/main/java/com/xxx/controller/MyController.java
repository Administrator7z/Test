package com.xxx.controller;

import com.xxx.vo.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎");
        mv.addObject("fun","dosome方法");
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/more.do",method = RequestMethod.POST)
    public ModelAndView doSome2(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/much.do",method = RequestMethod.POST)
    public ModelAndView doSome3(@RequestParam(value = "uname",required = false) String name, @RequestParam(value = "uage",required = false) Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/many.do",method = RequestMethod.POST)
    public ModelAndView doSome4(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/multi.do",method = RequestMethod.POST)
    public String doSome5(HttpServletRequest request,String name,Integer age){
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        return "show";
    }
    @RequestMapping(value = "/ajax.do",method = RequestMethod.POST)
    @ResponseBody
    public Student doSome6(String name,Integer age){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        return s1;
    }
    @RequestMapping(value = "/returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doStudentJsonObjectArray(String name, Integer age) {

        List<Student> list = new ArrayList<>();
        //调用service，获取请求结果数据 ， Student对象表示结果数据
        Student student = new Student();
        student.setName("李四同学");
        student.setAge(20);
        list.add(student);

        student = new Student();
        student.setName("张三");
        student.setAge(28);
        list.add(student);


        return list;

    }

    @RequestMapping(value = "/returnStringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name,Integer age){
        return "Hello SpringMVC 返回对象，表示数据";
    }

}
