package com.test.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //使用mybatis第一步：获取sqkSessionFactory对象
            String resource="mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //既然有了sqkSessionFactory，就可以从中获得sqlSession的实例了
    //sqlSession完全包含了面向数据库执行sql命令的所需的所有方法

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
