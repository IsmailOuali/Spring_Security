package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepoInterface;
import com.example.demo.service.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepoInterface userRepo;

    @Override
    public User insertUser(User user){
        userRepo.save(user);
        return user;
    }

    @Override
    public boolean login(String email,String password) {
        User usr = userRepo.findByEmail(email);
        return email.equals(usr.getEmail()) && password.equals(usr.getPassword());
    }

    @Override
    public void deleteUser(User user) {
        userRepo.delete(user);
    }
    @Override
    public User findByEmail(String email){
        System.out.println("here : "+ userRepo.findById(email));
        return userRepo.findById(email).orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }


}
