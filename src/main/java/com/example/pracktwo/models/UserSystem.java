package com.example.pracktwo.models;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.util.UUID;


public class UserSystem {

    private UUID id;

    private String email;

    private String name;

    private String password;

    public UserSystem() {}

    public UserSystem(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public UserSystem(UUID id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
