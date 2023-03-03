package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter@Setter @NoArgsConstructor @AllArgsConstructor
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private double itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column (name = "item_price")
    private String itemPrice;
//            @JoinColumn(name = "category_id")
//     Category category;

    @Override
    public String toString() {
        return "item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }
}
