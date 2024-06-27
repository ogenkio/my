package com.test.dao;

import com.test.pojo.User;
import com.test.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void getUserByid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserByid(1);
        System.out.println(user);

        sqlSession.close();
    }

}
