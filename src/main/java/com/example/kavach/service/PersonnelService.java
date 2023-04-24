package com.example.kavach.service;

import com.example.kavach.model.Personnel;

import java.util.List;

public interface PersonnelService {
    void addPersonnel(Personnel personnel);

    List<Personnel> findPersonnelByName(String name);

    List<Personnel> findPersonnelByPosAndAvl (String position);
}
