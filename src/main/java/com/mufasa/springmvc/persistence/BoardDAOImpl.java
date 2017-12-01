package com.mufasa.springmvc.persistence;

import com.mufasa.springmvc.domain.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

    @Inject
    SqlSession session;

    private static String namespace = "com.mufasa.springmvc.persistence.BoardDAO";

    @Override
    public void create(BoardVO vo) throws Exception {
        session.insert(namespace+".create" , vo);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return session.selectOne(namespace + ".read" , bno);
    }

    @Override
    public void update(BoardVO vo) throws Exception {
        session.update(namespace + ".update" ,  vo);
    }

    @Override
    public void delete(Integer bno) throws Exception {
        session.delete(namespace+".delete", bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return session.selectList(namespace + ".listAll");
    }

    @Override
    public List<BoardVO> listPage(int page) throws Exception {
        if( page <= 0){
            page = 1;
        }
        page = (page - 1)*10;
        return session.selectList(namespace + ".listPage", page);
    }
}
