package com.rs.e_comerance_dm.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class user_controler {
    @RequestMapping("/logon")
    public String login(){
        return "admin_source/logon.html";
    }
}
