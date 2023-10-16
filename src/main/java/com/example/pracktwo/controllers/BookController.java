package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.BookDao;
import com.example.pracktwo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BookController {

    private BookDao bookDao;

    @Autowired
    public BookController(BookDao bookDao) { this.bookDao = bookDao; }

    @GetMapping("/books")
    String books(Model model, @ModelAttribute("book") Book book){

        //CRUDFunctionsClass crudFunctionsClass = new CRUDFunctionsClass();
        //crudFunctionsClass.insert(new Book(""));

        List<Book> books = bookDao.index();

        model.addAttribute("title", "Книги");
        model.addAttribute("books", books);
        model.addAttribute("book", new Book());
        return "pages/book/index";
    }

    @GetMapping("/books/{id}")
    String show(Model model, @PathVariable("id") int id){
        Book book = bookDao.show(id);

        model.addAttribute("book", book);
        model.addAttribute("title", "Книга");
        return "pages/book/show";
    }
}
