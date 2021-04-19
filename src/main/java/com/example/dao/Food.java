package com.example.dao;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
