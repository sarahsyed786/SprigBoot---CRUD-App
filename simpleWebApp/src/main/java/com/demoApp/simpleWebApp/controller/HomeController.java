package com.demoApp.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public  String home(){
        return "Welcome home!";
    }

    @RequestMapping("/about")
    public  String about(){
        return "Read about!";
    }


}
