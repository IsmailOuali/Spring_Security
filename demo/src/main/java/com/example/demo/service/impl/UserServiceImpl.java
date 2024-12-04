package com.example.demo.service.impl;

import com.example.demo.exception.EmailAlreadyExistsException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

        private PasswordEncoder passwordEncoder;

    @Override
    public User insertUser(User user){
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException("Username already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Set.of("ROLE_USER"));
        return userRepository.save(user);
    }

    @Override
    public boolean login(String email,String password) {
        User usr = userRepository.findByEmail(email);
        return email.equals(usr.getEmail()  ) && password.equals(usr.getPassword());
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
    @Override
    public User findByEmail(String email){
        System.out.println("here : "+ userRepository.findById(email));
        return userRepository.findById(email).orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
