package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Table(name = "t_order_line_item")
public class OrderLineItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal tbill;
    private Integer qty;
    @JoinColumn(name = "order_id") @ManyToOne
    private Order order;

}
