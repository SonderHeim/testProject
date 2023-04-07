package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutUs(Model model) {
        model.addAttribute("title", "Информация о нас");
        return "about";
    }

    @GetMapping("/about-roses")
    public String aboutRoses(Model model) {
        return "AboutRoses";
    }

    @GetMapping("/about-georgins")
    public String aboutGeorgins(Model model){
        return "AboutGeorgins";
    }

    @GetMapping("/about-lutiks")
    public String aboutLutiks(Model model){
        return "AboutLutiks";
    }
}