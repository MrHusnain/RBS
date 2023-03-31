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
    private CategoryRepository categoryRepository;
    public Boolean searchCategory(Integer categoryId){
        return categoryRepository.existsById(categoryId);
    }
    // dissemble
    @Transactional
    public String CreateCategory(CategoryModel categoryModel){
        String Result;
        if (searchCategory(categoryModel.dissamble().getCategoryId())){
            Result="Already Exists";
        }
        else {
            upsert(categoryModel);
            Result="User Created";
        }
        return Result;
    }
//        Category category=Category.builder()
//                .categoryName(categoryModel.getCategoryName())
//                .build();
//          categoryRepository.save(category);
//          log.info("Category{} Saved",category.getCategoryId());

    //assembler
    public List<CategoryModel> getAllCategory(){
     return categoryRepository.findAll()
        .stream()
        .map(this::convertEntityToModel)
        .collect(Collectors.toList());
}
    @Transactional
    public CategoryModel getCategory(Integer id){
        CategoryModel categoryModel=new CategoryModel();
        return categoryModel.assamble(categoryRepository.findCategoryByCategoryId(id));
    }
private CategoryModel convertEntityToModel(Category category){
    CategoryModel categoryModel=new CategoryModel();
//    categoryModel.setCategoryId(category.getCategoryId());
//    categoryModel.setCategoryName(category.getCategoryName());
return categoryModel.assamble(category);
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

    public String updateClient(CategoryModel categoryModel) {
        String result;
        if (searchCategory(categoryModel.dissamble().getCategoryId())){
            upsert(categoryModel);
            result="updated";
        }
        else {
        result="Not found";
        }

        return result;
    }
    @Transactional
    public CategoryModel upsert(CategoryModel categoryModel){
        return categoryModel.assamble(categoryRepository.save(categoryModel.dissamble()));
    }
}







