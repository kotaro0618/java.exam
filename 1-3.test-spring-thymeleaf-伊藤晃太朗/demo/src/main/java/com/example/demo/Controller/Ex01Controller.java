package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Domain.Member;

@Controller
@RequestMapping("/ex01")
public class Ex01Controller {
    @RequestMapping("")
    public String index(){
        return "ex-01";
    }
    @PostMapping("/result")
    public String result(String name,Integer age,ArrayList<String> hobbyList
,Model model){
        Member member =new Member();
        member.setName(name);
        member.setAge(age);
        member.setHobbyList(hobbyList);
        model.addAttribute(member);
        return "ex-02";

    }
}
