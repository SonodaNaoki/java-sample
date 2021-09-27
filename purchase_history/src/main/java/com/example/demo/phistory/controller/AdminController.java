package com.example.demo.phistory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/index")
    public String adminIndex(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/index";
    }

    @GetMapping("/admin/login")
    public String adminLogin(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");

        return "admin/login";
    }
}
