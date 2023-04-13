package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Data  @Entity @AllArgsConstructor @NoArgsConstructor
@Table(name ="my_orders")
public class Order {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String orderDescription;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = ShoppingCart.class)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private List<ShoppingCart> cartItems;

    public Order(String orderDescription,Customer customer, List<ShoppingCart> cartItems) {
    }
}
