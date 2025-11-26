package com.tugas.service;

import com.tugas.model.User;
import java.util.ArrayList;
import java.util.List;

// SOLID - SRP (Single Responsibility Principle)
public class UserService implements IUserService {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(String name, String email) {
        users.add(new User(name, email));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public boolean isEmpty() {
        return users.isEmpty();
    }
}
