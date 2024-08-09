package com.rs.e_comerance_dm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home_controller {
    @RequestMapping("/home")
    public String home_page() {
        return "Front_end/home_page";
    }
}
