package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctions;
import com.example.pracktwo.models.Book;
import com.example.pracktwo.models.Pencil;
import com.example.pracktwo.models.UserSystem;
import com.example.pracktwo.repo.PencilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Objects;

@Controller
public class PencilController {

    @Autowired
    private PencilRepository pencilRepository;

    @GetMapping("/pencils")
    String books(Model model, @ModelAttribute("pencil") Pencil pencil) {
        List<Pencil> pencils = pencilRepository.findAll();

        //Filter
        if(pencil.getName() != null){
            pencils = pencils.stream().filter(x -> Objects.equals(x.getName(), pencil.getName())).toList();
        }

        if(pencil.getColor() != null){
            pencils = pencils.stream().filter(x -> Objects.equals(x.getColor(), pencil.getColor())).toList();
        }

        if(pencil.getPrice() != 0){
            pencils = pencils.stream().filter(x -> Objects.equals(x.getPrice(), pencil.getPrice())).toList();
        }
        //Filter

        model.addAttribute("title", "Карандаши");
        model.addAttribute("pencils", pencils);
        model.addAttribute("pencil", new Pencil());
        return "pencil";
    }
}
