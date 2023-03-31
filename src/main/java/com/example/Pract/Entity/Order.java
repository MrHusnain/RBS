package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;

@Data @NoArgsConstructor @AllArgsConstructor @Entity @Builder
@Table(name ="order_detail")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String OrderId;
    private  String OrderNbr;
    @OneToMany(mappedBy = "order")
    private List<OrderLineItem> orderLineItems;
}
