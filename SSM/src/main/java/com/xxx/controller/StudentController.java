package com.xxx.controller;

import com.xxx.Exception.StudentAgeException;
import com.xxx.Exception.StudentException;
import com.xxx.Exception.StudentNameException;
import com.xxx.pojo.Student;
import com.xxx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController  {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "/addStudent.do",method = RequestMethod.POST)
    public ModelAndView addStudent(Student student) {
        String tips = "失败";
        int num = studentService.addStudent(student);
        if (num > 0) {
            tips = "成功";
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("tips", tips);
        mv.setViewName("result");
        //不能与视图解析器一同使用
//        mv.setViewName("forward:/WEB-INF/result.jsp"); 可WEB-INF
//        mv.setViewName("redirect:xxx.jsp"); 不可WEB-INF ${param.tips}
        return mv;

    }
    @RequestMapping(value = "/findStudents.do")
    @ResponseBody
    public List<Student> findStudents(){
        return studentService.findStudents();
    }
//    -------------------------------------------------------------------------------------------
    @RequestMapping(value = "/xxx.do")
    public ModelAndView student(String name,Integer age) throws StudentException {
        ModelAndView mv = new ModelAndView();
        if ("zs".equals(name)){
            throw new StudentNameException("名字有误");
        }
        if (age > 80){
            throw new StudentAgeException("年龄大");
        }
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;

    }
}
