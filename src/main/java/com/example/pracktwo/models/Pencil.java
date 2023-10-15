package com.example.pracktwo.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Pencil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private String color;
    @Column(name = "price")
    private double price = 0;

    public Pencil() {}

    public Pencil(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Pencil(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Pencil(UUID id, String name, String color, double price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
