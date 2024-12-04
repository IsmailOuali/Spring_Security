package com.example.demo.controller;


import com.example.demo.model.Pigeon;
import com.example.demo.service.PigeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pigeons")
public class PigeonController {
    @Autowired
    private PigeonService pigeonService;

    @GetMapping
    public List<Pigeon> getAllPigeons()
    {
        return pigeonService.getAllPigeons();
    }

//    @GetMapping("/{id}")
//    public Pigeon getPigeonById(@PathVariable int id){
//        return pigeonService.getPigeonById((int)id);
//    }

    @PostMapping
    public Pigeon createPigeon(@RequestBody Pigeon pigeon){
        return pigeonService.savePigeon(pigeon);
    }

    @DeleteMapping("/{id}")
    public void deletePigeon(@PathVariable String id){
        pigeonService.deletePigeon(id);
    }



}
