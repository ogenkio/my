package com.test.dao;

import com.test.pojo.User;
import com.test.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserByid(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info into log4j");
        logger.debug("debug into log4j");
        logger.error("error into log4j");

    }

}
