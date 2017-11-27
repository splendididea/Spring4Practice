package com.mufasa.springmvc.service;

import com.mufasa.springmvc.domain.BoardVO;
import com.mufasa.springmvc.persistence.BoardDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Inject
    BoardDAO boardDAO;

    @Override
    public void regist(BoardVO boardVO) throws Exception {
        boardDAO.create(boardVO);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return boardDAO.read(bno);
    }

    @Override
    public void modify(BoardVO boardVO) throws Exception {
        boardDAO.update(boardVO);
    }

    @Override
    public void remove(Integer bno) throws Exception {
        boardDAO.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return boardDAO.listAll();
    }
}
