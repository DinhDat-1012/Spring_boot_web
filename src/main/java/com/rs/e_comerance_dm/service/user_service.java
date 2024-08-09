package com.rs.e_comerance_dm.service;

import com.rs.e_comerance_dm.Model.user;

public interface user_service {
    user findByUserName(String username);
}
