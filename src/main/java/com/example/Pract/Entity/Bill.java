package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_bill")
public class Bill {
    @Column(name = "b_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "t_bill")
    private int totalBill;

    @OneToOne (cascade = CascadeType.ALL) @JoinColumn
    private Order order;

    @OneToOne (cascade = CascadeType.ALL) @JoinColumn (name="customer_id")
    private Customer customer;
    @ManyToOne (cascade = CascadeType.ALL) @JoinColumn (name = "user_id")
    private User user;

}
