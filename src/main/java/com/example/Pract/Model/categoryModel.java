package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data @NoArgsConstructor @AllArgsConstructor
public class categoryModel {
    private int categoryId;
    private String categoryName;

    }
