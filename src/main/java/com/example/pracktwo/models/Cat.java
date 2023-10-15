package com.example.pracktwo.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(name = "like")
    private int like = 0;
    @Column(name = "view")
    private int view = 0;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int like, int view) {
        this.name = name;
        this.like = like;
        this.view = view;
    }

    public Cat(UUID id, String name, int like, int view) {
        this.id = id;
        this.name = name;
        this.like = like;
        this.view = view;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
