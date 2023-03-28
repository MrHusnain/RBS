package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;

@Data @NoArgsConstructor @AllArgsConstructor @Entity @Builder @Table(name ="Order_Detail")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long OrderId;
    private  String OrderNbr;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItem> orderLineItems;
}
