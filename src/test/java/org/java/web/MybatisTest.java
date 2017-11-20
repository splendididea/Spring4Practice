package org.java.web;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class MybatisTest {

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFactory(){
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void testSession() throws Exception {
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            System.out.println(sqlSession);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
