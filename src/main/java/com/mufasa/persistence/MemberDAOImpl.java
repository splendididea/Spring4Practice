package com.mufasa.persistence;

import com.mufasa.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAOImpl implements MemberDAO{

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "com.mufasa.persistence.MemberDAO";

    @Override
    public String getTime() {
        String rtnVal = sqlSession.selectOne(namespace + ".getTime");
        System.out.println(rtnVal);
        return rtnVal;
    }

    @Override
    public void insertMember(MemberVO vo) {
        sqlSession.insert(namespace + ".insertMember" , vo);
    }

    @Override
    public MemberVO readMember(String userid) throws Exception {
        return sqlSession.selectOne(namespace + ".selectMember",userid);
    }

    @Override
    public MemberVO readMemberWithPw(String userid, String userpw) throws Exception {
        Map paramMap = new HashMap();
        paramMap.put("userid" , userid);
        paramMap.put("userpw" , userpw);
        return sqlSession.selectOne(namespace + ".readMemberWithPw",paramMap);
    }
}
