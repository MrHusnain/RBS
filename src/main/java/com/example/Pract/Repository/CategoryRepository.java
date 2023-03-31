package com.example.Pract.Repository;

import com.example.Pract.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category,Integer> {
    Category findCategoryByCategoryId(Integer categoryId);


}
