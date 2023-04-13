package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor @Table(name = "Shopping_Cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "product_id")
    private int productId;
    @Column (name = "product_name")
    private String productName;
    @Column (name = "qty")
    private int quantity;
    @Column (name = "amount")
    private float amount;
//    @Column(name = "category")
//    private int categroyId;
}
