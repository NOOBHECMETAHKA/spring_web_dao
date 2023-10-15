package com.example.pracktwo.controllers;

import com.example.pracktwo.models.Book;
import com.example.pracktwo.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    String index(Model model){
        model.addAttribute("title", "Главная страница");
        return "index";
    }

    @GetMapping("/books")
    String books(Model model, @ModelAttribute("book") Book book){
        List<Book> books = bookRepository.findAll();

        if(book.getTitle() != null){
            books = books.stream().filter(x -> Objects.equals(x.getTitle(), book.getTitle())).toList();
        }

        model.addAttribute("title", "Книги");
        model.addAttribute("books", books);
        model.addAttribute("book", new Book());
        return "book";
    }



}