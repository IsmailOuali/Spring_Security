package com.example.demo.service;

import com.example.demo.model.Pigeon;

import java.util.List;
import java.util.Optional;

public interface PigeonService {
    Pigeon savePigeon(Pigeon pigeon);
    Optional<Pigeon> getPigeonById(String id);
    List<Pigeon> getAllPigeons();
    void deletePigeon(String id);
}
