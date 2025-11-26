package com.tugas.service;

import com.tugas.model.User;
import java.util.List;

// === DESIGN PATTERN: PROXY (Structural) ===

// SOLID - OCP (Open/Closed Principle):

// SOLID - LSP (Liskov Substitution Principle):
public class UserServiceProxy implements IUserService {
    private final IUserService realService;

    public UserServiceProxy(IUserService realService) {
        this.realService = realService;
    }

    @Override
    public void addUser(String name, String email) {
        System.out.println("[SYSTEM LOG] Permintaan masuk: Menambah user baru (" + name + ")");
        realService.addUser(name, email);
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println("[SYSTEM LOG] Permintaan masuk: Mengambil semua data user");
        return realService.getAllUsers();
    }

    @Override
    public boolean isEmpty() {
        return realService.isEmpty();
    }
}
