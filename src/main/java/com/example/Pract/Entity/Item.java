package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Entity
@Data
@Table(name = "item")
public class Item {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    @Column(name = "item_name")
    private String name;
    @Column (name = "item_price")
    private float price;
 @ManyToOne (fetch = FetchType.LAZY)
 @JoinColumn (name = "category_id")
  private Category category;

}
