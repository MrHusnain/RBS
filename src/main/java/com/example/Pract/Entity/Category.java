 package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
//8587c53a-2ce7-48a4-8e31-31c1b4cdb588
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id")
 @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "category_name")
    private String name;
//   @OneToMany (mappedBy = "category",cascade = CascadeType.ALL)
//  private List<Item> items;

}
