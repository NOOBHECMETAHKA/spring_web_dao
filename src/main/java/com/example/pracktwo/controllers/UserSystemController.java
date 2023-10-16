package com.example.pracktwo.controllers;

import com.example.pracktwo.models.UserSystem;
import com.example.pracktwo.repo.UserSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class UserSystemController {

    @Autowired
    private UserSystemRepository userSystemRepository;

    @GetMapping("/usersSystem")
    String books(Model model, @ModelAttribute("userSystem") UserSystem userSystem){
        List<UserSystem> usersSystem = userSystemRepository.findAll();

        model.addAttribute("title", "Пользователи");
        model.addAttribute("usersSystem", usersSystem);
        model.addAttribute("userSystem", new UserSystem());
        return "userSystem";
    }
}
