package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> findByUsername(String username) ;
    Optional<User> findByEmail(String email);
    List<User> findAllUsers();
    boolean validateUser(String username, String rawPassword);


