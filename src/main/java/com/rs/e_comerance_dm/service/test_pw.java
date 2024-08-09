package com.rs.e_comerance_dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test_pw {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("1"));

    }
}
