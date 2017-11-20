package com.mufasa.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {

    @RequestMapping("/doJSON")
    public @ResponseBody ProductVO doJSON(){

        ProductVO vo = new ProductVO("새상품",20000);
        return vo;
    }
}
