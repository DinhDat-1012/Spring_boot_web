package com.rs.e_comerance_dm.service;

import com.rs.e_comerance_dm.Model.Category;

import java.util.List;

public interface Category_service {
    List<Category> getAll();
    boolean CreateCategory(Category category);
    Category findById(int id);
    boolean updateCategory(Category category);
    boolean deleteCategory(int id);
}
