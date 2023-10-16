package com.example.pracktwo.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


public class Human {

    private int id;

    private String firstName;

    private String lastName;

    private LocalDate dateBirth;

    private double weight = 50;

    public Human() {}

    public Human(String firstName, String lastName, LocalDate dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
    }

    public Human(String firstName, String lastName, LocalDate dateBirth, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.weight = weight;
    }

    public Human(int id, String firstName, String lastName, LocalDate dateBirth, double weight) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
