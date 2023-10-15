package com.example.pracktwo.models;

public class Cat {
    private int id;
    private String name;
    private int like;
    private int view;

    public Cat() {}

    public Cat(String name, int like, int view) {
        this.name = name;
        this.like = like;
        this.view = view;
    }

    public Cat(int id, String name, int like, int view) {
        this.id = id;
        this.name = name;
        this.like = like;
        this.view = view;
    }
}
