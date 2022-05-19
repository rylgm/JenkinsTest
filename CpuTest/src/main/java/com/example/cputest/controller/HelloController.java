package com.example.cputest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HelloController {

    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        System.out.println("--------------ffdata-------------");
        return "hello world";
    }
}
