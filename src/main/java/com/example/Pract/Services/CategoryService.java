//package com.example.Pract.Services;
//import com.example.Pract.Entity.Category;
//import com.example.Pract.Model.CategoryModel;
//import com.example.Pract.Repository.CategoryRepository;
//import jakarta.transaction.Transactional;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.stream.Collectors;
//@Service
//@Slf4j
//public class CategoryService {
//    @Autowired
//    private CategoryRepository categoryRepository;
//    public Boolean searchCategory(Integer categoryId){
//        return categoryRepository.existsById(categoryId);
//    }
//    // dissemble
//    @Transactional
//    public String CreateCategory(CategoryModel categoryModel){
//        String Result;
//        if (searchCategory(categoryModel.dissamble().getId())){
//            Result="Already Exists";
//        }
//        else {
//            upsert(categoryModel);
//            Result="Category Created";
//        }
//        return Result;
//    }
////        Category category=Category.builder()
////                .categoryName(categoryModel.getCategoryName())
////                .build();
////          categoryRepository.save(category);
////          log.info("Category{} Saved",category.getCategoryId());
//
//    //assembler
//    public List<CategoryModel> getAllCategory(){
//     return categoryRepository.findAll()
//        .stream()
//        .map(this::convertEntityToModel)
//        .collect(Collectors.toList());
//}
//    @Transactional
//    public CategoryModel getCategory(Integer id){
//        CategoryModel categoryModel=new CategoryModel();
//        return categoryModel.assamble(categoryRepository.findCategoryById(id));
//    }
//private CategoryModel convertEntityToModel(Category category){
//    CategoryModel categoryModel=new CategoryModel();
//return categoryModel.assamble(category);
//}
//public String DeleteCategory(Integer id){
//        String Result;
//        if (searchCategory(id)){
//            categoryRepository.deleteById(id);
//            Result="Deleted";
//        } else {
//            Result="don't Exist";
//        }
//        return Result;
//}
//
//    public String updateCategory(CategoryModel categoryModel) {
//        String result;
//        if (searchCategory(categoryModel.dissamble().getId())){
//            upsert(categoryModel);
//            result="updated";
//        }
//        else {
//        result="Not found";
//        }
//
//        return result;
//    }
//    @Transactional
//    public CategoryModel upsert(CategoryModel categoryModel){
//        return categoryModel.assamble(categoryRepository.save(categoryModel.dissamble()));
//    }
//}
//
//
//
//
//
//
//
