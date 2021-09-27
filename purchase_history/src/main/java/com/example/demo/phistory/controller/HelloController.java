package com.example.demo.phistory.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.Optional;

import com.example.demo.phistory.repository.*;
import com.example.demo.phistory.service.*;

@Controller
public class HelloController {
    
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }

    @GetMapping("/users")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("hello");
        mav.addObject("msg","This is a MyData sample.");
        Iterable list = userService.getUser();
        mav.addObject("datalist",list);
        mav.addObject("message", "Hello Thymeleaf!!");
        return mav;
    }
}