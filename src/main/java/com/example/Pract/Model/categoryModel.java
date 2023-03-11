package com.example.Pract.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class categoryModel {


        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int categoryId;
        private String categoryName;

    }
