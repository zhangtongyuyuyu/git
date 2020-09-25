package com.example.git1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class indexController {

    @RequestMapping("hello")
    public String index(){
        return "index";
    }

}
