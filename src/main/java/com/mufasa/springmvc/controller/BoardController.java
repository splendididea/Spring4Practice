package com.mufasa.springmvc.controller;

import com.mufasa.springmvc.domain.BoardVO;
import com.mufasa.springmvc.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Inject
    BoardService boardService;

    @RequestMapping(value = "/register" ,method = RequestMethod.GET)
    public void registGet(BoardVO boardVO,Model model) throws Exception{
        model.addAttribute("result" , "success");
        logger.info("register get...............");
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String registerPost(BoardVO boardVO, Model model, RedirectAttributes rttr) throws Exception {
        logger.info("register post...............s");
        logger.info(boardVO.toString());
        boardService.regist(boardVO);
        rttr.addFlashAttribute("msg" , "SUCCESS");
        //model.addAttribute("result" ,"success");
        // return "/board/success";
        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "listAll" , method = RequestMethod.GET )
    public void listAll(Model model) throws Exception{
        logger.info("in listAll..........");
        model.addAttribute("list" , boardService.listAll());
    }

    @RequestMapping(value = "read", method = RequestMethod.GET)
    public void read(@RequestParam("bno")int bno, Model model) throws Exception{
        model.addAttribute(boardService.read(bno));
    }

    @RequestMapping(value = "remove" )
    public String remove(@RequestParam("bno") int bno,RedirectAttributes rtts) throws Exception{
        boardService.remove(bno);
        rtts.addFlashAttribute("msg" ,"SUCCESS");
        return "redirect:/board/listAll";
    }


}
