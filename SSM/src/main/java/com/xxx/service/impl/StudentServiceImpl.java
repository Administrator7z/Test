package com.xxx.service.impl;

import com.xxx.mapper.StudentMapper;
import com.xxx.pojo.Student;
import com.xxx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public List<Student> findStudents() {
        return studentMapper.selectStudents();
    }
}
