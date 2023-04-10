package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity @Table (name = "order_items")
public class orderItems {
    @Id
    private int id;
    @Column
    private int qty;
    @Column
    private double price;
    @ManyToOne (fetch = FetchType.LAZY) @JoinColumn(name = "item_id")
    private Item item;



}
