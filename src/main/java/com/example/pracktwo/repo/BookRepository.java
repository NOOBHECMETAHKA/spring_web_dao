package com.example.pracktwo.repo;

import com.example.pracktwo.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {

}
