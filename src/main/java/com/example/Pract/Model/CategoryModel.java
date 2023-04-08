package com.example.Pract.Model;
import com.example.Pract.Entity.Category;
import lombok.Data;
@Data
public class CategoryModel {
    private int id;
    private String name;
    public Category dissamble(){
        Category category=new Category();
        category.setId(id);
        category.setName(name);
        return category;
    }
    public CategoryModel assamble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());
        return categoryModel;
    }
    }
