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
import java.util.Objects;

@Controller
public class HumanController {

    @Autowired
    private HumanRepository humanRepository;

    @GetMapping("/humans")
    String books(Model model, @ModelAttribute("human") Human human){
        List<Human> humans = humanRepository.findAll();

        //Filter
        if(human.getFirstName() != null){
            humans = humans.stream().filter(x -> Objects.equals(x.getFirstName(), human.getFirstName())).toList();
        }

        if(human.getLastName() != null){
            humans = humans.stream().filter(x -> Objects.equals(x.getLastName(), human.getLastName())).toList();
        }

        if(human.getWeight() != 0){
            humans = humans.stream().filter(x -> Objects.equals(x.getWeight(), human.getWeight())).toList();
        }

        if(human.getDateBirth() != null){
            humans = humans.stream().filter(x -> Objects.equals(x.getDateBirth(), human.getDateBirth())).toList();
        }
        //Filter
        
        model.addAttribute("title", "Персональная информация");
        model.addAttribute("humans", humans);
        model.addAttribute("human", new Human());
        return "human";
    }
}
