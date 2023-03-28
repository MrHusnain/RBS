package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    @Id
    @Column(name = "customer_id")

    @GeneratedValue(strategy =GenerationType.AUTO)
private int CustomerId;
    @Column
private String CustomerName;
//    @OneToOne (cascade = CascadeType.ALL)
//    @JoinColumn (name="customer_id")
//public CustomerSelectedOrder customerOrder;


}
