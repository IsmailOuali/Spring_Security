package com.example.demo.service;

import com.example.demo.model.Eleveur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EleveurService {
    Eleveur saveEleveur(Eleveur eleveur);
    Eleveur updateEleveur(Eleveur eleveur);
    Eleveur getEleveurById(String id);
    List<Eleveur> getAllEleveur();
    void deleteEleveur(String id);
}
