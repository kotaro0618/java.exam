package com.example.test_spring_mvc_ito.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Ex03Controller {
    @RequestMapping("/index")
    public String index(){
       return "name-form";
    }
    @RequestMapping("/showname")
    public String showName(String comment){
        System.out.println(comment);
        return "finished";
    }
}
