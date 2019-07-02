package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("spring")
public class SpringController {
    @RequestMapping("start")
    public String start(Model model){
        return "one";
    }
}
