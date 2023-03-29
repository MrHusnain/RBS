package com.example.Pract.Services;

import com.example.Pract.Entity.Category;
import com.example.Pract.Model.CategoryModel;
import com.example.Pract.Repository.CategoryRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public Boolean searchCategory(Integer categoryId){
        return categoryRepository.existsById(categoryId);
    }
    // dissemble
    public void CreateCategory(CategoryModel categoryModel){
        Category category=Category.builder()
                .categoryName(categoryModel.getCategoryName())
                .build();
          categoryRepository.save(category);
          log.info("Category{} Saved",category.getCategoryId());
    }
    //assembler
    public List<CategoryModel> getAllCategory(){
     return categoryRepository.findAll()
        .stream()
        .map(this::convertEntityToModel)
        .collect(Collectors.toList());
}

private CategoryModel convertEntityToModel(Category category){
    CategoryModel categoryModel=new CategoryModel();
    categoryModel.setCategoryId(category.getCategoryId());
    categoryModel.setCategoryName(category.getCategoryName());
return categoryModel;
}
public String DeleteCategory(Integer CategoryId){
        String Result;
        if (searchCategory(CategoryId)){
            categoryRepository.deleteById(CategoryId);
            Result="Deleted";
        } else {
            Result="don't Exist";
        }
        return Result;
}
}







