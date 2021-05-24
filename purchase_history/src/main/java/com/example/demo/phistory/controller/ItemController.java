package com.example.demo.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/item/list")
    public String adminitemList(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "/item/list";
    }
     @GetMapping("/item/regist")
    public String adminitemRegist(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "/item/regist";
    }
     @GetMapping("/admin/item/remove")
    public String adminitemRemove(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "/item/remove";
    }
     @GetMapping("/item/edit")
    public String adminitemEdit(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "/item/edit";
    }
}
