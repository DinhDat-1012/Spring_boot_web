
package com.rs.e_comerance_dm.Controller.admin;

import com.rs.e_comerance_dm.Model.Category;
import com.rs.e_comerance_dm.service.Category_service_implement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin/category")
public class category_controller {
    @Autowired
    Category_service_implement category_service;


    @GetMapping
    private String category(Model model){
        List<Category> category_list = category_service.getAll();
        model.addAttribute("category_list", category_list);
        return "admin_source/category/category";
    }
    @GetMapping("add-category")
    private String add_category(){
        return "admin_source/category/add_category.html";
    }
}
