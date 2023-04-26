package com.example.kavach.service;

import com.example.kavach.model.Coordinates;
import com.example.kavach.model.SiteLocation;

import java.awt.*;
import java.util.List;

public interface AdminService {
    String saveCoordinates (List<Coordinates> adminParameters);

    SiteLocation getCoordinates(String id);
}
