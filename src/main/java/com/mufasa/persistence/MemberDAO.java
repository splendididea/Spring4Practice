package com.mufasa.persistence;

import com.mufasa.domain.MemberVO;
import org.springframework.context.annotation.Primary;

@Primary
public interface MemberDAO {
    public String getTime();

    public void insertMember(MemberVO vo);

    public MemberVO readMember(String userid) throws Exception;

    public MemberVO readMemberWithPw(String userid, String userpw) throws Exception;
}
