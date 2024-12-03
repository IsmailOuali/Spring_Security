package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Resultat {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;


    @ManyToOne
    @JoinColumn(name = "pigeon_id")
    private Pigeon pigeon;

    private double flightTime;
    private double distance;
    private double vitesse;
    private double points;


}
