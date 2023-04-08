package com.example.Pract.Services;
import com.example.Pract.Entity.Category;
import com.example.Pract.Model.CategoryModel;
import com.example.Pract.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
@Slf4j
public class CategoryService {
    @Autowired
    private ItemServices itemServices;
    @Autowired
    private CategoryRepository categoryRepository;
    public Boolean searchCategory(Integer categoryId){
        return categoryRepository.existsById(categoryId);
    }
    // dissemble
    @Transactional
    public String CreateCategory(CategoryModel categoryModel){
        String Result;
        if (searchCategory(categoryModel.dissamble().getId())){
            Result="Already Exists";
        }
        else {
            upsert(categoryModel);
            Result="Category Created";
        }
        return Result;
    }
    //assembler
    public List<CategoryModel> getAllCategory(){
        List<Category> categories=categoryRepository.findAll();
     return categories
        .stream()
        .map(category -> new CategoryModel().assamble(category))
        .collect(Collectors.toList());
}
    public CategoryModel getCategory(Integer id){
        CategoryModel categoryModel=new CategoryModel();
        return categoryModel.assamble(categoryRepository.findCategoryById(id));
    }
public String DeleteCategory(Integer id){
        String Result;
        if (searchCategory(id)){
            categoryRepository.deleteById(id);
            Result="Deleted";
        } else {
            Result="don't Exist";
        }
        return Result;
}
    public String updateCategory(CategoryModel categoryModel) {
        String result;
        if (searchCategory(categoryModel.dissamble().getId())){
            upsert(categoryModel);
            result="updated";
        }
        else {
        result="Not found";
        }

        return result;
    }
    public CategoryModel upsert(CategoryModel categoryModel){
        Category category=categoryModel.dissamble();
        category=categoryRepository.save(category);
        return categoryModel.assamble(category);
    }
}







