package com.rs.e_comerance_dm.repository;

import com.rs.e_comerance_dm.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface user_repository extends JpaRepository<user,Long> {
    user findByUserName(String userName);
}
