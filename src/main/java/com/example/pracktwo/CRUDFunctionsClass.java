package com.example.pracktwo;

import com.example.pracktwo.dao.BookDao;
import com.example.pracktwo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CRUDFunctionsClass {

    private BookDao bookDao;

    @Autowired
    public CRUDFunctionsClass(BookDao bookDao){
        this.bookDao = bookDao;
    }

    public void insert(Book book){
        bookDao.books.add(new Book());
    }
}
