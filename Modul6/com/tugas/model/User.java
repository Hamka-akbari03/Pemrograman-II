package com.tugas.model;

// SOLID - SRP (Single Responsibility Principle):
public class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Nama: " + name + " | Email: " + email;
    }
}
