package com.example.kavach.service;

import com.example.kavach.model.SiteLocation;

import java.awt.*;
import java.util.List;

public interface AdminService {
    void saveCoordinates (List<SiteLocation> adminParameters);
}
