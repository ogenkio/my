package com.test.dao;

import com.test.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudent();

    List<Student> getStudent2();
}
