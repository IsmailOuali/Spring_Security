package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Eleveur {
    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private String colombierName;
    private String cordGPS;

    public Eleveur(String id, String name, String email, String password, String colombierName, String cordGPS) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.colombierName = colombierName;
        this.cordGPS = cordGPS;

    }

    public Eleveur(String name, String email, String password, String colombierName, String cordGPS) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.colombierName = colombierName;
        this.cordGPS = cordGPS;
    }
    public Eleveur() {

    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getColombierName(){
        return colombierName;
    }
    public void setColombierName(String colombierName){
        this.colombierName = colombierName;
    }
    public String getCordGPS(){
        return cordGPS;
    }
    public void setCordGPS(String cordGPS){
        this.cordGPS = cordGPS;
    }
}
