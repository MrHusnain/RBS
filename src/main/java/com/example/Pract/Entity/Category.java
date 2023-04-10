 package com.example.Pract.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "category_name")
    private String name;
   @OneToMany (mappedBy = "category",cascade = CascadeType.ALL)
  private List<Item> items;

}
