package com.example.pracktwo.controllers;

import com.example.pracktwo.models.Pencil;
import com.example.pracktwo.repo.PencilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class PencilController {

    @Autowired
    private PencilRepository pencilRepository;

    @GetMapping("/pencils")
    String books(Model model, @ModelAttribute("pencil") Pencil pencil) {
        List<Pencil> pencils = pencilRepository.findAll();


        model.addAttribute("title", "Карандаши");
        model.addAttribute("pencils", pencils);
        model.addAttribute("pencil", new Pencil());
        return "pencil";
    }
}
