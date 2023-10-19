package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.HumanDao;
import com.example.pracktwo.models.Human;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HumanController {


    HumanDao humanDao;
    CRUDFunctionsClass crudFunctionsClass;

    @Autowired
    public HumanController(HumanDao humanDao){
        this.humanDao = humanDao;
        this.crudFunctionsClass = new CRUDFunctionsClass(humanDao);
    }

    @GetMapping("humans/create")
    String create(Model model){
        model.addAttribute("title", "Создание личных данных");
        model.addAttribute("cat", new Human());
        return "pages/human/add";
    }

    @PostMapping("book/store")
    String store(Model model, @Valid @ModelAttribute("human") Human human){
        crudFunctionsClass.insert(human);
        return "redirect:/humans";
    }

    @GetMapping("human/edit/{id}")
    String edit(Model model, @PathVariable("id") int id){
        Human human = humanDao.show(id);
        if(human == null){
            return "redirect:/humans";
        }
        model.addAttribute("bookPARAMS", human);
        model.addAttribute("title", "Создание персональных данных");
        return "pages/human/update";
    }

    @PostMapping("human/update/{id}")
    String update(Model model, @PathVariable("id") int id, @Valid @ModelAttribute("human") Human human){
        human.setId(id);
        crudFunctionsClass.update(human);
        return "redirect:/humans";
    }

    @PostMapping("human/delete/{id}")
    String delete(Model model, @PathVariable("id") int id){
        Human human = humanDao.show(id);
        if(human == null){
            return "redirect:/humans";
        }
        crudFunctionsClass.delete(id);
        return "redirect:/humans";
    }

}
