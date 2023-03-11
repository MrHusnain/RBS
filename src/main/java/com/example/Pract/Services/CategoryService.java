package com.example.Pract.Services;

import com.example.Pract.Entity.Category;
import com.example.Pract.Model.categoryModel;
import com.example.Pract.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Transactional
public class CategoryService {
    @Autowired
   private CategoryRepository categoryRepository;


//    // get all items / retrive
//    public List<Category> getAll(){
//        return categoryRepository.findAll();
//    }
    // add new category
    public void addCategory( Category category){


//        Category categoryEntity = new Category();
//        categoryEntity.setCategoryName(categoryModel);
//        categoryEntity.setCategoryName(categoryModel.getCategory);
        categoryRepository.save(category);

    }
}
//// update a category
//    public void UpdateCategory(){
//
//    }
//    // delete a category
//    public void delete(){
//
//    }
//}
