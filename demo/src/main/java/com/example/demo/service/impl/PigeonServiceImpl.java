package com.example.demo.service.impl;

import com.example.demo.model.Pigeon;
import com.example.demo.repository.PigeonRepository;
import com.example.demo.service.PigeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PigeonServiceImpl implements PigeonService {

    @Autowired
    private PigeonRepository pigeonRepository;

    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }

    public Optional<Pigeon> getPigeonById(String id) {
        return pigeonRepository.findById(id);
    }

    public Pigeon savePigeon(Pigeon pigeon) {
        return pigeonRepository.save(pigeon);
    }

    public void deletePigeon(String id) {
        pigeonRepository.deleteById(id);
    }
}
