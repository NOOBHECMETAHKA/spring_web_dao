package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.BookDao;
import com.example.pracktwo.dao.CatDao;
import com.example.pracktwo.models.Cat;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Objects;

@Controller
public class CatController {
    private CatDao catDao;
    CRUDFunctionsClass crudFunctionsClass;


    @Autowired
    public CatController(CatDao catDao) { this.catDao = catDao;
    crudFunctionsClass = new CRUDFunctionsClass(catDao); }

    @GetMapping("/cats")
    String cats(Model model, @ModelAttribute("cat") Cat cat){

        List<Cat> cats = catDao.index();

        model.addAttribute("title", "Книги");
        model.addAttribute("cats", cats);
        model.addAttribute("cat", new Cat());
        return "pages/cat/index";
    }


    @GetMapping("cats/edit/{id}")
    String edit(Model model, @PathVariable("id") int id){
        Cat cat = catDao.show(id);
        if(cat == null){
            return "redirect:/cats";
        }
        model.addAttribute("catPARAMS", cat);
        model.addAttribute("title", "Создание кота");
        return "pages/cat/update";
    }

    @GetMapping("cats/create")
    String create(Model model){
        model.addAttribute("title", "Создание котика");
        model.addAttribute("cat", new Cat());
        return "pages/cat/add";
    }

    @PostMapping("cats/store")
    String store(Model model, @Valid @ModelAttribute("cats") Cat cat){
        crudFunctionsClass.insert(cat);
        return "redirect:/cats";
    }

    @PostMapping("cats/update/{id}")
    String update(Model model, @PathVariable("id") int id, @Valid @ModelAttribute("cat") Cat cat){
        cat.setId(id);
        crudFunctionsClass.update(cat);
        return "redirect:/cats";
    }

    @PostMapping("cat/delete/{id}")
    String delete(Model model, @PathVariable("id") int id){
        Cat cat = catDao.show(id);
        if(cat == null){
            return "redirect:/cats";
        }
        crudFunctionsClass.delete(cat);
        return "redirect:/cats";
    }
}
