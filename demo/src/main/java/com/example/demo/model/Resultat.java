package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Resultat {
    @Id
    private String id;

    private Competition competition;


    private Pigeon pigeon;

    private double flightTime;
    private double distance;
    private double vitesse;
    private double points;

    public Resultat() {

    }
    private Resultat( Competition competition, Pigeon pigeon, double flightTime, double distance, double vitesse, double points) {
        this.id = id;
        this.competition = competition;
        this.pigeon = pigeon;
        this.flightTime = flightTime;
        this.distance = distance;
        this.vitesse = vitesse;
        this.points = points;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public Pigeon getPigeon() {
        return pigeon;
    }

    public void setPigeon(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
