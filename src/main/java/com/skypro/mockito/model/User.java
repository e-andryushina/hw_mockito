package com.skypro.mockito.model;

import java.util.Objects;

public class User {
    private final String name1;

    public User(String name) {
        this.name1 = name;
    }

    public String getName() {
        return name1;
    }
}
