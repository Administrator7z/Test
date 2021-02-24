package com.xxx.test;

import com.xxx.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyTest {
    SqlSession session;
    @Before
    public void first() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        session = factory.openSession();
    }
    @After
    public void closeSession(){
        session.close();
    }
    @Test
    public void testGetAll() throws Exception{
        List<Student> getAllStudents = session.selectList("com.xxx.student.getAll");
        for (Student getAllStudent : getAllStudents) {
            System.out.println(getAllStudent);
        }

    }
    @Test
    public void insertStudent(){
        Student stu = new Student("张三三","123@qq.com",20);
        int i = session.insert("com.xxx.student.insertStudent",stu);
        System.out.println(i);
        session.commit();
    }
    @Test
    public void getById(){
        Student stu = session.selectOne("com.xxx.student.getById",1);
        System.out.println(stu);
    }
    @Test
    public void delete(){
        int i = session.delete("com.xxx.student.delete",5);
        System.out.println(i);
        session.commit();
    }
    @Test
    public void update(){
        Student stu = new Student(6,"张三三","123@qq.com",21);
        int i = session.update("com.xxx.student.delete",stu);
        System.out.println(i);
        session.commit();
    }
}
