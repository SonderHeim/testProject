package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.Role;
import com.cursed.Cursed.models.User;
import com.cursed.Cursed.models.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegController {
    private final UserAuth userAuth;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegController(UserAuth userAuth, PasswordEncoder passwordEncoder) {
        this.userAuth = userAuth;
        this.passwordEncoder = passwordEncoder;
    }
    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "Регистрация");
        return "reg";
    }
    @PostMapping("/reg")
    public String addUser(@ModelAttribute("user") User user, Model model) {
        User userFromDB = userAuth.getUser(user.getUsername());

        if (userFromDB != null) {
            model.addAttribute("error", "такой пользователь уже есть");
            return "reg";
        }

        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userAuth.save(user);

        return "redirect:/index";
    }
}