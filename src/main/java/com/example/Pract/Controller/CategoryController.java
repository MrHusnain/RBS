package com.example.Pract.Controller;

import com.example.Pract.Entity.Category;
//import com.example.Pract.Services.CategoryService;
import com.example.Pract.Model.categoryModel;
import com.example.Pract.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired

 private CategoryService categoryService;
    @GetMapping("/items_category")
    public List<categoryModel> getAllCategory(){

        return categoryService.getAllCategory();
    }
    @PostMapping("/category")
    public void AddCategory(@RequestBody Category category){




    }
//    public List<Category> GetAll(){
//        return categoryService.getAll();
//    }
}
