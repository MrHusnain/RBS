package com.example.Pract.Services;

import com.example.Pract.Entity.Category;
import com.example.Pract.Model.categoryModel;
import com.example.Pract.Repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category insert(categoryModel categoryModel){

        return categoryModel.assemble(categoryRepository.save(categoryModel.disassemble()));
    }
}



//    Category();
////        categoryEntity.setCategoryName(categoryModel);
////        categoryEntity.setCategoryName(categoryModel.getCategory);
//        categoryRepository.save(category);

//}


