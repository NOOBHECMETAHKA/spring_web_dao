package com.example.pracktwo.models;

public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private String dateBirth;
    private double weight;

    public Human() {}

    public Human(String firstName, String lastName, String dateBirth, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.weight = weight;
    }

    public Human(int id, String firstName, String lastName, String dateBirth, double weight) {
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

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
