package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class CustomerSelectedOrder {
    @Id
    private Long OrderId;
    @OneToOne
   @JoinColumn
    Customer customer;
    @OneToOne
   @JoinColumn (name = "selected item")
    item items;



}
