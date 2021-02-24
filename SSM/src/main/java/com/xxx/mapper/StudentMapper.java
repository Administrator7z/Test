package com.xxx.mapper;

import com.xxx.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int insertStudent(Student student);
    List<Student> selectStudents();

}
