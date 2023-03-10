package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
//
//import java.util.List;

@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Category {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double CategoryId;
    @Column (name = "Category_name")
    private String CategoryName;



    @Override
    public String toString() {
        return "Category{" +
                "CategoryId=" + CategoryId +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
