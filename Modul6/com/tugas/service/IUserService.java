package com.tugas.service;

import com.tugas.model.User;
import java.util.List;

// SOLID - ISP (Interface Segregation Principle):
public interface IUserService {
    void addUser(String name, String email);
    List<User> getAllUsers();
    boolean isEmpty();
}
