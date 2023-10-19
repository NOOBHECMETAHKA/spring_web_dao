package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.BookDao;
import com.example.pracktwo.models.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    private BookDao bookDao;
    CRUDFunctionsClass crudFunctionsClass;

    @Autowired
    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
        crudFunctionsClass = new CRUDFunctionsClass(bookDao);
    }

    @GetMapping("/books")
    String books(Model model, @ModelAttribute("book") Book book){

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

    @GetMapping("books/create")
    String create(Model model){
        model.addAttribute("title", "Создание книги");
        model.addAttribute("book", new Book());
        return "pages/book/add";
    }

    @PostMapping("books/store")
    String store(Model model, @Valid @ModelAttribute("book") Book book){
        crudFunctionsClass.insert(book);
        return "redirect:/books";
    }

    @GetMapping("books/edit/{id}")
    String edit(Model model, @PathVariable("id") int id){
        Book book = bookDao.show(id);
        if(book == null){
            return "redirect:/books";
        }
        model.addAttribute("bookPARAMS", book);
        model.addAttribute("title", "Создание книги");
        return "pages/book/update";
    }

    @PostMapping("books/update/{id}")
    String update(Model model, @PathVariable("id") int id, @Valid @ModelAttribute("book") Book book){
        book.setId(id);
        crudFunctionsClass.update(book);
        return "redirect:/books";
    }

    @PostMapping("books/delete/{id}")
    String delete(Model model, @PathVariable("id") int id){
        Book book = bookDao.show(id);
        if(book == null){
            return "redirect:/books";
        }
        book.setId(id);
        crudFunctionsClass.delete(book);
        return "redirect:/books";
    }

}
