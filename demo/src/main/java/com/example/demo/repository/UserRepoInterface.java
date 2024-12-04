package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepoInterface extends JpaRepository<User, String> {
    User findByEmail(String email);
    boolean existsByEmail (String email);

}