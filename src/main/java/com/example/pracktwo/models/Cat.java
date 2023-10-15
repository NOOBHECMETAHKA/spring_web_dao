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
    @Column(name = "count_likes")
    private Long like = 0L;
    @Column(name = "count_views")
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

    public Cat(UUID id, String name, Long like, Long view) {
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
