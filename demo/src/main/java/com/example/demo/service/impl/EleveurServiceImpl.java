package com.example.demo.service.impl;


import com.example.demo.model.Eleveur;
import com.example.demo.repository.EleveurRepository;
import com.example.demo.service.EleveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveurServiceImpl implements EleveurService {


    @Autowired
    private EleveurRepository eleveurRepository;

    public Eleveur getEleveurById(String id) {
//  return eleveurRepository.findBy( id);
        return  null;
    }
    public List<Eleveur> getAllEleveur() {
        return eleveurRepository.findAll();
    }

    public Eleveur saveEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    public Eleveur updateEleveur(Eleveur eleveur) {
        return eleveurRepository.save(eleveur);
    }
    public void deleteEleveur(String id) {
        eleveurRepository.deleteById(id);
    }
}
