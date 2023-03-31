package com.example.Pract.Controller;

//import com.example.Pract.Services.CategoryService;
import com.example.Pract.Entity.Category;
import com.example.Pract.Model.CategoryModel;
import com.example.Pract.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
 private CategoryService categoryService;
    @PostMapping public void CreateCategory(@RequestBody CategoryModel categoryModel){
        categoryService.CreateCategory(categoryModel);
     }
    @PutMapping("/update")
    private String updateClient(@RequestBody CategoryModel categoryModel){
        return categoryService.updateClient(categoryModel);
    }
    //find by id
    @GetMapping("/{id}")
    private CategoryModel getClientById(@PathVariable(name = "id")Integer categoryId){
        return categoryService.getCategory(categoryId);
    }
    // get all categories
    @GetMapping
    public List<CategoryModel> getAllCategory()
    {
        return categoryService.getAllCategory();
    }
    @DeleteMapping("/{categoryId}")
    public String DeleteCategory(@PathVariable (name="categoryId")Integer categoryId){
       return categoryService.DeleteCategory(categoryId);

    }

}
