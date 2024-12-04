package com.example.demo.service;

import com.example.demo.model.Competition;

import java.util.List;

public interface CompetitionService {

    Competition saveCompetition(Competition competition);
    Competition updateCompetition(Competition competition);
    List<Competition> getAllCompetitions();
    Competition getCompetitionById(String id);
    void deleteCompetition(String id);

}
