package com.mufasa.springmvc.model.board.dao;

import com.mufasa.springmvc.model.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by mufasa on 17. 6. 5.
 */
@Repository
public class BoardDAOImpl implements BoardDAO {

    @Inject
    SqlSession sqlSession;

    @Override
    public List<BoardDTO> listBoard() {
        return sqlSession.selectList("selectListBoard");
    }
}
