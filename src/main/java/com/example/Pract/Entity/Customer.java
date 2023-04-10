package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int customerId;
     @Column (name = "customer_name")
      private String customerName;

    @OneToOne(mappedBy = "customer")
   private Bill bill;



}
