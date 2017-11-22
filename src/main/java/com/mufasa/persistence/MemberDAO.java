package com.mufasa.persistence;

import com.mufasa.domain.MemberVO;

public interface MemberDAO {

    public String getTime();

    public void insertMember(MemberVO vo);
}
