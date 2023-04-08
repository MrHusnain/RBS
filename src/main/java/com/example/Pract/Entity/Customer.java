package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder @Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int customerId;
     @Column
      private String CustomerName;
    @OneToOne(mappedBy = "customer")
    public Order order;
    @OneToOne (mappedBy = "customer")
    public OrderLineItem orderLineItem;


}
