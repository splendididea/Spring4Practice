package com.mufasa.springmvc.persistence;

import com.mufasa.springmvc.domain.BoardVO;

import java.util.List;

public interface BoardDAO {

    void create(BoardVO vo) throws Exception;

    BoardVO read(Integer bno) throws Exception;

    void update(BoardVO vo) throws Exception;

    void delete(Integer bno) throws Exception;

    List<BoardVO> listAll() throws Exception;

    List<BoardVO> listPage(int page) throws Exception;

}
