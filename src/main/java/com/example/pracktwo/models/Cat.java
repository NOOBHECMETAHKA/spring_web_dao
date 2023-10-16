package com.example.pracktwo.models;

import jakarta.persistence.*;

import java.util.UUID;

public class Cat {

    private int id;

    private String name;

    private Long like = 0L;

    private Long view = 0L;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Long like, Long view) {
        this.name = name;
        this.like = like;
        this.view = view;
    }

    public Cat(int id, String name, Long like, Long view) {
        this.id = id;
        this.name = name;
        this.like = like;
        this.view = view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLike() {
        return like;
    }

    public void setLike(Long like) {
        this.like = like;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }
}
