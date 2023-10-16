package com.example.pracktwo.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

public class Book {

    private int id;

    private String title;

    private String description;

    private LocalDate datePublic;

    public Book() {}

    public Book(String title, String description, LocalDate datePublic) {
        this.title = title;
        this.description = description;
        this.datePublic = datePublic;
    }

    public Book(int id, String title, String description, LocalDate datePublic) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datePublic = datePublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(LocalDate datePublic) {
        this.datePublic = datePublic;
    }
}
