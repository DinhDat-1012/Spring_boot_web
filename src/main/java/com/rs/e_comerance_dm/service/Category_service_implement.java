package com.rs.e_comerance_dm.service;

import com.rs.e_comerance_dm.Model.Category;
import com.rs.e_comerance_dm.repository.Category_repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Category_service_implement implements Category_service{
    private static final Logger log = LoggerFactory.getLogger(Category_service_implement.class);
    @Autowired
    private Category_repository category_repository;
    @Override
    public List<Category> getAll() {
        return this.category_repository.findAll();
    }

    @Override
    public boolean CreateCategory(Category category) {
         try {
             category_repository.save(category);
             return true;
         }catch (Exception e){
             log.error(e.getMessage());
             return false;
         }
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean updateCategory(Category category) {
        return false;
    }

    @Override
    public boolean deleteCategory(int id) {
        return false;
    }
}
