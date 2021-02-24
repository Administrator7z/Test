package com.xxx;



import com.xxx.s02.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest2 {
    ApplicationContext ac;
    @Before
    public void ac(){
         ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
    @Test
    public void studentTest(){
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}

