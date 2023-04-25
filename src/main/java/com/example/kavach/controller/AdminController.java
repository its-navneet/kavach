package com.example.kavach.controller;
import com.example.kavach.model.Personnel;
import com.example.kavach.model.SiteLocation;
import com.example.kavach.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/passCoordinates")
    private ResponseEntity<?> passCoordinates(@RequestBody SiteLocation adminParameters){
        adminService.saveCoordinates(adminParameters);
        return ResponseEntity.ok("Parameters uploaded");
    }

//    @GetMapping("/getCenteroidCoordinates")
//    private SiteLocation getCenteroidCoordinates(){
//        return adminService.getCoordinates();
//    }

//    @PostMapping("/passSelectedPersonnels")
//    private ResponseEntity<?> passSelectedPersonnels(List<Personnel> personnelList){
//
//    }
}
