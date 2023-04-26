package com.example.kavach.service;
import com.example.kavach.model.Coordinates;
import com.example.kavach.model.SiteLocation;
import com.example.kavach.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public String saveCoordinates (List<Coordinates> adminParameters) {
        SiteLocation temp = new SiteLocation();
        temp.setCoordinatesList(adminParameters);
        adminRepository.save(temp);
        return temp.getId();
        
    }

    @Override
    public SiteLocation getCoordinates(String id) {
        return adminRepository.findById(id).get();
    }
}
