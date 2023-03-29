package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

//import java.util.List;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity @Builder
public class Item {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private int itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column (name = "item_price")
    private String itemPrice;
@ManyToOne (cascade = CascadeType.ALL)
@JoinColumn (name ="category_id")
private Category category;
}
