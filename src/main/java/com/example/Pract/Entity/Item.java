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
    private String price;
 @ManyToOne (fetch = FetchType.LAZY)
 @JoinColumn (name = "category_id")
  private Category category;
 @ManyToOne
    private Bill bill;
    @OneToOne (mappedBy = "item",cascade = CascadeType.ALL)
    private Order order;
// @ManyToOne (mappedBy = "items",cascade = CascadeType.ALL)
//    @JoinColumn(name = "ordereline_item")
//    private OrderLineItem orderLineItem;
}
