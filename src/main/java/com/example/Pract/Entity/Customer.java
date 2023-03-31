package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int customerId;
     @Column
      private String CustomerName;
    @OneToOne
    @JoinColumn (name="customer_id")
    public Order order;
    @JoinColumn @OneToOne
    public OrderLineItem orderLineItem;


}
