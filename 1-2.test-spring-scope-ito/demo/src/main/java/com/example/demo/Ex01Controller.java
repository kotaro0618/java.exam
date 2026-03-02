package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex01")
public class Ex01Controller {
    @RequestMapping("")
    public String index(){
        return "Ex01";
    }
    @RequestMapping("/result")
    public String Result(String mail,String password,Model model){
        if("yamada@sample.com".equals(mail)&&"yamayama".equals(password)){
model.addAttribute("result","成功");
        }else{
            model.addAttribute("result", "失敗");
        }
        return "result";
    }
}
