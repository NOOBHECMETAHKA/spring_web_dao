package com.example.pracktwo.controllers;

import com.example.pracktwo.models.Book;
import com.example.pracktwo.models.Cat;
import com.example.pracktwo.repo.BookRepository;
import com.example.pracktwo.repo.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Objects;

@Controller
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("/cats")
    String books(Model model, @ModelAttribute("cat") Cat cat){
        List<Cat> cats = catRepository.findAll();

        //Filter
        if(cat.getName() != null){
            cats = cats.stream().filter(x -> Objects.equals(x.getName(), cat.getName())).toList();
        }

        if(cat.getLike() != null){
            cats = cats.stream().filter(x -> Objects.equals(x.getLike(), cat.getLike())).toList();
        }

        if(cat.getView() != 0){
            cats = cats.stream().filter(x -> Objects.equals(x.getView(), cat.getView())).toList();
        }
        //Filter

        model.addAttribute("title", "Книги");
        model.addAttribute("cats", cats);
        model.addAttribute("cat", new Cat());
        return "cat";
    }
}
