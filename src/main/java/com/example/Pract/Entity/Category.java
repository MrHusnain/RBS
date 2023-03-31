 package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity @Builder
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "categoryId")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column (name = "category_name")
    private String categoryName;
    @OneToMany (mappedBy = "category")
    private List<Item> items;

}
