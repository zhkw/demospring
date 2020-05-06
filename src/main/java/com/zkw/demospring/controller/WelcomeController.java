package com.zkw.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String loginMessage(ModelMap mod){
        //List<Student> list = studentRepository.findAll();
        mod.addAttribute("name","zhoukw");
        //mod.addAttribute("todos",list);
        return "welcome";
    }
}
