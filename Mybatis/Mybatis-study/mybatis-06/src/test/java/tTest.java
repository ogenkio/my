import com.test.dao.StudentMapper;
import com.test.dao.TeacherMapper;
import com.test.pojo.Student;
import com.test.pojo.Teacher;
import com.test.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class tTest {
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);

            System.out.println(teacher);


        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = mapper.getStudent();

        for (Student student1 : student) {
            System.out.println(student1);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacherBytid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherBytid2(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
