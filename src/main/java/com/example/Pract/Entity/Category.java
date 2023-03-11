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
@Table(name = "category")
public class Category {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column (name = "category_name")
    private String categoryName;


}
