package com.test.dao;

import com.test.pojo.Student;
import com.test.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid")int id);

    Teacher getTeacherBytid(@Param("tid")int id);

    Teacher getTeacherBytid2(@Param("tid")int id);
}
