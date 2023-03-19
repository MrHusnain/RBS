package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
public class categoryModel {



    private int categoryId;
        private String categoryName;

    public categoryModel(int categoryId,String categoryName) {
        this.categoryId = categoryId;
        this.categoryName =categoryName;
    }

    public Category disassemble(){
    Category category=new Category();
    category.setCategoryId(categoryId);
    category.setCategoryName(categoryName);
    return category;
}
public categoryModel assemble(){
    categoryModel categoryModel=new categoryModel();
    categoryModel.setCategoryName(categoryModel.getCategoryName());
    categoryModel.setCategoryId(categoryModel.getCategoryId());
    return categoryModel;

}
    }
