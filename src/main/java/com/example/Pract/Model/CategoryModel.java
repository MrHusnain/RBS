package com.example.Pract.Model;


import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {
    private int categoryId;
    private String categoryName;
    private List<Item> items;
    public Category dissamble(){
        Category category=new Category();
        category.setCategoryId(this.categoryId);
        category.setCategoryName(this.categoryName);
        return category;
    }
    public CategoryModel assamble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setCategoryId(category.getCategoryId());
        categoryModel.setCategoryName(category.getCategoryName());
        return categoryModel;
    }
    }
