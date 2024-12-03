package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Competition {

    @Id
    private String id;

    private String competitionName;
    private String cordGPS;
    private Date startDate;


    private double distance;



}
