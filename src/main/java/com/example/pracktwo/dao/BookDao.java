package com.example.pracktwo.dao;

import com.example.pracktwo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class BookDao {
    public static int BOOKS_COUNT;

    public List<Book> books;
    {
        books = new ArrayList<>();
        books.add(new Book(BOOKS_COUNT++, "Крутая книга", "Супер описание", LocalDate.parse("2003-12-22")));
        books.add(new Book(BOOKS_COUNT++, "Крутая книга2", "Супер описание", LocalDate.parse("2003-12-23")));
        books.add(new Book(BOOKS_COUNT++, "Крутая книга3", "Супер описание", LocalDate.parse("2003-12-24")));
        books.add(new Book(BOOKS_COUNT++,"Крутая книга4", "Супер описание", LocalDate.parse("2003-12-25")));
        books.add(new Book(BOOKS_COUNT++, "Крутая книг5", "Супер описание", LocalDate.parse("2003-12-26")));
    }

    public List<Book> index(){
        return books;
    }

    public Book show(int id){
        return books.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().orElse(null);
    }
}
