package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
    @RequestMapping("")
    public String index(){
        return "exam02";
    }
    @RequestMapping("/tasu")
    public String tasu(Integer num1,Integer num2,HttpSession session){
        User user=new User();
        int sum=num1+num2;
        user.setNum1(num1);
        user.setNum2(num2);
        session.setAttribute("user", user);
        session.setAttribute("sum", sum);

        return "exam02-result";
    }
    @RequestMapping("/result2")
    public String Result2(){
        return "exam2-result2";
    }
    
}
