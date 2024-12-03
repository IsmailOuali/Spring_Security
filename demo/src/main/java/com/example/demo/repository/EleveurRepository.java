package com.example.demo.repository;

import com.example.demo.model.Eleveur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveurRepository extends JpaRepository<Eleveur, String> {
}
