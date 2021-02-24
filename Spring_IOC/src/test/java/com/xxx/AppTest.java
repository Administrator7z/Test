package com.xxx;


import com.xxx.s01.Student;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppTest{
    ApplicationContext ac;
    @Before
    public void ac(){
         ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
    @Test
    public void studentTest(){
        Student stu = (Student) ac.getBean("stu");
        Student stu2 = (Student) ac.getBean("stu2");
        Student stu3 = (Student) ac.getBean("stu3");
        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu3);
    }
    @Test
    public void schoolTest() throws ParseException {
        Date myDate = (Date) ac.getBean("myDate");
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        String mydate = sdf.format(myDate);
        System.out.println(mydate);

    }
}

