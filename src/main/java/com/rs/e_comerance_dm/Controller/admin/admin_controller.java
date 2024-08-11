package com.rs.e_comerance_dm.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/admin")
@Controller
public class admin_controller {
    @GetMapping
    public String index() {
        return "redirect:/admin/";
    }
    @RequestMapping("/")
    private static String admin_source() {
        return "admin_source/admin_source.html";
    }
}
