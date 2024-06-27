package com.test.dao;

import com.test.pojo.User;
import com.test.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    @Test
    public void getUserList(){
        
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //执行sql

            //方式一：getMapper
            UserMapper UserMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = UserMapper.getUserList();

            //方式二
//        List<User> objects = sqlSession.selectList("com.test.dao.UserDao.getUserList");

            for(User user:userList){
                System.out.println(user);
            }
        }finally {
            //关闭sqlSession
            sqlSession.close();
        }
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
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.addUser(new User(5, "小红", "11111"));
        if(i>0){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4,"小王","12321"));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(5);

        sqlSession.commit();

        sqlSession.close();
    }

}
