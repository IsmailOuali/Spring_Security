package com.example.demo.repository;

import com.example.demo.model.Pigeon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PigeonRepository extends JpaRepository<Pigeon, String> {
}
