package com.javamaster.controller;


import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by win7 on 2017/3/12.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name", "test1");
        return "index";
    }
}
