package com.example.Pract.Services;

import com.example.Pract.Entity.Category;
import com.example.Pract.Model.categoryModel;
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
    public void CreateCategory(categoryModel categoryModel){
        Category category=Category.builder()
                .categoryName(categoryModel.getCategoryName())
                .build();
          categoryRepository.save(category);
          log.info("Category{} Saved",category.getCategoryId());
    }
    public List<categoryModel> getAllCategory(){

     return categoryRepository.findAll()
        .stream()
        .map(this::convertEntityToModel)
        .collect(Collectors.toList());
}

private categoryModel convertEntityToModel(Category category){
    categoryModel categoryModel=new categoryModel();
    categoryModel.setCategoryId(category.getCategoryId());
    categoryModel.setCategoryName(category.getCategoryName());
return categoryModel;
}

}






