package com.mufasa.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

    private static Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(){
        logger.info("exception Handler.............");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("common_error");
        return mav;
    }

}
