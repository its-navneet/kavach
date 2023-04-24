package com.example.kavach.service;
import com.example.kavach.model.SiteLocation;
import com.example.kavach.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public void saveCoordinates (SiteLocation adminParameters) {
        adminRepository.save(adminParameters);
    }
}
