package com.example.Pract.Controller;

import com.example.Pract.Entity.Category;
//import com.example.Pract.Services.CategoryService;
import com.example.Pract.Model.categoryModel;
import com.example.Pract.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController { @Autowired
 private CategoryService categoryService;
    @PostMapping public void CreateCategory(@RequestBody categoryModel categoryModel){
        categoryService.CreateCategory(categoryModel);
     }
    @GetMapping
    public List<categoryModel> getAllCategory()
    {
        return categoryService.getAllCategory();
    }
}
