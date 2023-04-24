package com.example.kavach.controller;


import com.example.kavach.model.Personnel;
import com.example.kavach.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @PostMapping("/addPersonnel")
    public ResponseEntity<?> addPersonnel (@RequestBody Personnel personnel) {
        personnelService.addPersonnel(personnel);
        return ResponseEntity.ok("Personnel registered successfully!");
    }

    @GetMapping("find/{name}")
    public List<Personnel> findPersonnelByName(@PathVariable String name){
        return personnelService.findPersonnelByName(name);
    }

    @GetMapping("/available/{position}")
    public List<Personnel> findPersonnelByPosAndAvl(@PathVariable String position){
        return personnelService.findPersonnelByPosAndAvl(position);
    }


}
