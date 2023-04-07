package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String MainPage(Model model) {
        model.addAttribute("title", "Главная Страница");
        return "index";
    }
    @GetMapping("/index")
    public String MainPage1(Model model) {
        model.addAttribute("title", "Главная Страница");
        return "index";
    }
}