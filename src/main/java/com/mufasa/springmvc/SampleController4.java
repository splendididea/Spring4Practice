package com.mufasa.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {

    private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);

    @RequestMapping("doE")
    public String doE (Model model, RedirectAttributes rttrs){
        logger.info("doE called but redirect to /doE......");
        rttrs.addAttribute("msg" , "This is the Messege!! with redirected");
        return "redirect:/doF";
    }

    @RequestMapping("doF")
    public void doF(String msg){
        logger.info("doF called..............." + msg);
    }
}
