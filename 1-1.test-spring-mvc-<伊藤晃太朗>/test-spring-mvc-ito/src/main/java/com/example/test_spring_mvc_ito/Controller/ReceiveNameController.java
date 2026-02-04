package com.example.test_spring_mvc_ito.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ReceiveNameForm;

@Controller
@RequestMapping("/ex04")
public class ReceiveNameController {
    @RequestMapping("/index")
    public String index(){
        return "name-form";
    }
    @ModelAttribute
    public ReceiveNameForm form(){
        return new ReceiveNameForm();
    }
    @RequestMapping("/index2")
    public String showName(ReceiveNameForm form){
        System.out.println(form.getComment());
        return "finished";
    }
}
