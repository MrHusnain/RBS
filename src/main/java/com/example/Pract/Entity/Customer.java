package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
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
