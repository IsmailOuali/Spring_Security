package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
public class Pigeon {
    @Id
    private String id;


    @ManyToOne
    @JoinColumn(name = "eleveur_id")
    private Eleveur eleveur;
    private String ringNumber;
    private String sexe;
    private Integer age;
    private String couleur;


    public Pigeon() {

    }
}
