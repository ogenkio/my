import com.test.dao.BlogMapper;
import com.test.pojo.Blog;
import com.test.util.IDUtils;
import com.test.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        blog.setAuthor("啊qian");
        blog.setCreateTime(new Date());
        blog.setViews(100);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring MVC");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring Boot");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map=new HashMap<>();
        map.put("title", "Spring2");
        map.put("id", "2");

        mapper.updateBlog(map);

//        for (Blog blog : blogs) {
//            System.out.println(blog);
//        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        ArrayList<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");

        HashMap map =new HashMap<>();
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();

    }

}
