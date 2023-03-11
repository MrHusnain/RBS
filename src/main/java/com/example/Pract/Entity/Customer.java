package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//
@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
private int CustomerId;
    @Column
private String CustomerName;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn
public void CustomerOrder(){
        CustomerSelectedOrder customerOrder;

}
}
