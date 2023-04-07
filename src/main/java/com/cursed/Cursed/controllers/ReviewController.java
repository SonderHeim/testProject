package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.Review;
import com.cursed.Cursed.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/review")
    public String reviewMain(Model model){
        Iterable<Review> reviews = reviewRepository.findAll();
        model.addAttribute("reviews", reviews);
        //model.addAttribute("title", "Отзывы");
        return "review";
    }

    @GetMapping("/reviews/add")
    public String MainPage5(Model model) {
        return "reviews-add";
    }

    @PostMapping("/reviews/add")
    public String ReviewAdd (@RequestParam String name, @RequestParam String text, Model model){
        //model.addAttribute("title", "Добавление отзыва");
        Review review = new Review(name, text);
        reviewRepository.save(review);
        return "redirect:/index";
    }

}