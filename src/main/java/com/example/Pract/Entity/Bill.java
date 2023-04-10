package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bill")
public class Bill {
    @Column(name = "bill_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne (fetch = FetchType.LAZY) @JoinColumn (name = "order_id")
    private Order order;
    @OneToMany(fetch = FetchType.LAZY) @JoinColumn (name = "items")
    private List <Item> items;
    @OneToOne (fetch = FetchType.LAZY) @JoinColumn (name="customer_id")
    private Customer customer;
    @ManyToOne (fetch = FetchType.LAZY) @JoinColumn (name = "user_id")
    private User user;
    @Column (name = "total_bill")
    private int totalBill;

}
