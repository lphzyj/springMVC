package com.lph.app.Service;

import java.util.List;

import com.lph.app.entity.UserProfile;

public interface UserProfileService {
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
