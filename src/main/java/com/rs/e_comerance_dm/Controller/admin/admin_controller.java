package com.rs.e_comerance_dm.Controller.admin;

import com.rs.e_comerance_dm.Model.customer_user_detail;
import com.rs.e_comerance_dm.service.custom_user_detail_service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private static String admin_source(Model model) {
        customer_user_detail user_detail = (customer_user_detail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user_detail.get__user());

        return "admin_source/admin_source.html";
    }
}
