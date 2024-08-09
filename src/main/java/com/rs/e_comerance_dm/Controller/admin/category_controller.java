
package com.rs.e_comerance_dm.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/category")
public class category_controller {
    @GetMapping
    private String category(){
        return "admin_source/category/category";
    }
}
