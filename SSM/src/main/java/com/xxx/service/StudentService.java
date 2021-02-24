package com.xxx.service;

import com.xxx.pojo.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
