package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.Entity.Category;

import java.util.List;

public interface CategoryServiceInterface {
    List<Category> getAllCategories();
    Category addCategory();
    Category getCategoryById();
    void deleteCategory();
}
