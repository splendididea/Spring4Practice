package com.mufasa.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by mufasa on 17. 5. 8.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        System.out.println("여기여기");
        return "home";
    }
}
