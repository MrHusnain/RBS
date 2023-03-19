package com.example.Pract.Repository;

import com.example.Pract.Entity.Category;
import com.example.Pract.Model.categoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface CategoryRepository extends JpaRepository <Category,Integer> {
}
