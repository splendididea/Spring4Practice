package org.java.web;

import com.mufasa.domain.MemberVO;
import com.mufasa.persistence.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class MemberDAOTest {

    @Inject
    public MemberDAO dao;

    @Test
    public void testTime() throws Exception {
        System.out.println(dao.getTime());
    }

    @Test
    public void testInsertMemeber()throws Exception{
        MemberVO vo = new MemberVO();
        vo.setEmail("jjemail@emil.com");
        vo.setUserid("jjemail");
        vo.setUsername("James");
        vo.setUserpw("2212");
        dao.insertMember(vo);
    }
}
