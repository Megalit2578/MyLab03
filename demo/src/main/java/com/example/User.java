package com.example;

public class User {
    private int id;
    private String name;
    private boolean active;

    public User(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }
    // Các getter khác nếu cần
}
