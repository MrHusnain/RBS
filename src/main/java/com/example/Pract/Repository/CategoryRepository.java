package com.example.Pract.Repository;

import com.example.Pract.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category,Integer> {
}
