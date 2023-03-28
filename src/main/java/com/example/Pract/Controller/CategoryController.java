package com.example.Pract.Controller;

//import com.example.Pract.Services.CategoryService;
import com.example.Pract.Model.CategoryModel;
import com.example.Pract.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController { @Autowired
 private CategoryService categoryService;
    @PostMapping public void CreateCategory(@RequestBody CategoryModel categoryModel){
        categoryService.CreateCategory(categoryModel);
     }
    @GetMapping
    public List<CategoryModel> getAllCategory()
    {
        return categoryService.getAllCategory();
    }
}
