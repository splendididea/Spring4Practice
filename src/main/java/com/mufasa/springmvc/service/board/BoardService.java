package com.mufasa.springmvc.service.board;

import com.mufasa.springmvc.model.board.dto.BoardDTO;

import java.util.List;

/**
 * Created by mufasa on 17. 6. 5.
 */
public interface BoardService {
    List<BoardDTO> listBoard();
}
