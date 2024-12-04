package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserServiceInterface {
    User insertUser(User user);
    boolean login(String email,String password);
    void deleteUser(User user);
    User findByEmail(String email);

    List<User> findAll();
}
