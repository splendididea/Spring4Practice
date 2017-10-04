package com.mufasa.springmvc.service.board;

import com.mufasa.springmvc.model.board.dao.BoardDAO;
import com.mufasa.springmvc.model.board.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mufasa on 17. 6. 5.
 */
@Service
public class BoardServiceImpl implements BoardService {

    BoardDAO boardDAO;

    public List<BoardDTO> listBoard(){
        return boardDAO.listBoard();
    }
}
