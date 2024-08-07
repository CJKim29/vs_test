package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @RequestMapping(value="/hello.do", method=RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello in home";
    }
    
    @RequestMapping("/hi.do")
    public String hi(Model model){
        
        String name = "집에서";
        
        model.addAttribute("name", name);

        return "hi";    // /templates/ + hi + .html

    }
}