package com.rs.e_comerance_dm.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class admin_controller {
    @RequestMapping("/admin")
    private static String admin_source() {
        return "admin_source/admin_source.html";
    }
}
