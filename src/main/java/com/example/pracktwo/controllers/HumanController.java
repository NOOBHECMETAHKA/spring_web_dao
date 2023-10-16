package com.example.pracktwo.controllers;

import com.example.pracktwo.models.Cat;
import com.example.pracktwo.models.Human;
import com.example.pracktwo.repo.CatRepository;
import com.example.pracktwo.repo.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.List;

@Controller
public class HumanController {

    @Autowired
    private HumanRepository humanRepository;

    @GetMapping("/humans")
    String books(Model model, @ModelAttribute("human") Human human){
        List<Human> humans = humanRepository.findAll();
        
        model.addAttribute("title", "Персональная информация");
        model.addAttribute("humans", humans);
        model.addAttribute("human", new Human());
        return "human";
    }
}
