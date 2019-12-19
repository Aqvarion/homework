package com.blackapple.homework.controller;

import com.blackapple.homework.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class RegistrationController {

    @GetMapping("/registration")
    public String registrationForm(Model model){
        model.addAttribute("user",new User());
        return "user";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute User user){
        return "result";
    }
}
