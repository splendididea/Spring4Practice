package com.mufasa.springmvc.controller.board;

import com.mufasa.springmvc.model.board.dto.BoardDTO;
import com.mufasa.springmvc.service.board.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mufasa on 17. 6. 5.
 */
@Controller
@RequestMapping("/board")
public class BoardController {

    @Inject
    BoardService boardService;

    @RequestMapping("/list.do")
    public ModelAndView list(Model model) {
        ModelAndView mav = new ModelAndView();
        List<BoardDTO> boardList = boardService.listBoard();
        mav.addObject("list",boardList);
        mav.setViewName("/board/list");
        return mav;
    }
}
