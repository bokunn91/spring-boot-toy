package com.example.springboottoy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private String name;

    protected User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
