package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Table(name = "customer")
public class Customer {
    @Id
    @Column @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
     @Column (name = "customer_name")
      private String name;
     @Column (name = "customer_email" )
     private String email;
    public Customer(String name, String email) {
    }
}
