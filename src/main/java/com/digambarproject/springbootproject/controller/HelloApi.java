package com.digambarproject.springbootproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloApi {

   @RequestMapping("/")
    public String getHello() {
        return "Hello World";
    }
}
