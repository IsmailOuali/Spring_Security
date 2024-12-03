package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pigeon {
    @Id
    private String id;


    private Eleveur eleveur;
    private String ringNumber;
    private String sexe;
    private Integer age;
    private String couleur;


    private Pigeon( Eleveur eleveur,String ringNumber, String sexe, Integer age, String couleur) {
        this.id = id;
        this.eleveur = eleveur;
        this.ringNumber = ringNumber;
        this.sexe = sexe;
        this.age = age;
        this.couleur = couleur;
    }
    public Eleveur getEleveur() {
        return eleveur;
    }

    public void setEleveur(Eleveur eleveur) {
        this.eleveur = eleveur;
    }
    public Pigeon() {}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRingNumber() {
        return ringNumber;
    }
    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
