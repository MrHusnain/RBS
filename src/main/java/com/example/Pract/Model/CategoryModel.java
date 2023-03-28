package com.example.Pract.Model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data @NoArgsConstructor @AllArgsConstructor
public class CategoryModel {
    private int categoryId;
    private String categoryName;

    }
