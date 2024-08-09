package com.rs.e_comerance_dm.service;

import com.rs.e_comerance_dm.Model.user;
import com.rs.e_comerance_dm.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user_service_implement implements user_service {
    @Autowired
    private user_repository userRepository;
    @Override
    public user findByUserName(String username) {
    return userRepository.findByUsername(username);
    }
}
