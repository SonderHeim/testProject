package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryFilterController {
    @GetMapping("/gallery-roses")
    public String GalleryRoses(Model model) {
            return "gallery-roses";
        }

    @GetMapping("/gallery-georgins")
    public String GalleryGeorgins(Model model) {
        return "gallery-georgins";
    }

    @GetMapping("/gallery-lutiks")
    public String GalleryLutiks(Model model){
        return "gallery-lutiks";
    }
}