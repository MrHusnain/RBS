package com.example.Pract.Model;


import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Data @NoArgsConstructor
@AllArgsConstructor
 @JsonIgnoreProperties("item")
public class CategoryModel {

    private int id;
    private String name;
//    private List<Item> items;
    public Category dissamble(){
        Category category=new Category();
        category.setId(this.id);
        category.setName(this.name);
        return category;
    }
    public CategoryModel assamble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());
        return categoryModel;
    }
    }
