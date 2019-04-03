package com.itheima.test;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    private SqlSession session = null;
    @Before
    public void init() throws IOException {
        //1.读取核心配置文件
        InputStream is = Resources.getResourceAsStream("spring/myBaties.xml");
        //2.创建SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3.获取SqlSession,他提供了操作数据库的一些方法
        //selectList(),selectOne(),delete(),update(),insert();
        session = factory.openSession();
    }
    @After
    public void destory() {
        //5.提交事务
        session.commit();
        //6.释放资源
        session.close();
    }


//    //4.执行操作,参数应该是:namespace+"."+statement
//    @org.junit.Test
//    public void findAll(){
//        List<User> list = session.()
//        for(User u: list){
//            System.out.println(u);
//        }
//    }
}
