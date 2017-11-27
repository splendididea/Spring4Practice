package com.mufasa.springmvc.service;

import com.mufasa.springmvc.domain.BoardVO;

import java.util.List;

public interface BoardService {

    public void regist(BoardVO boardVO) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public void modify(BoardVO boardVO) throws Exception;

    public void remove(Integer bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
