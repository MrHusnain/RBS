package com.example.Pract.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Data  @Entity @AllArgsConstructor @NoArgsConstructor
@Table(name ="order_detail")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long orderId;
    private  String OrderNbr;
    @OneToMany(mappedBy = "order")
    private List<OrderLineItem> orderLineItems;
    @OneToOne (mappedBy = "order")
    private Bill bill;
//    @ManyToOne (fetch = FetchType.LAZY)
//    @JoinColumn (name = "category_id")
//    private Item item;
//    @OneToOne (fetch = FetchType.LAZY)@JoinColumn (name = "customer_id")
//   private Customer customer;
@OneToOne(fetch = FetchType.LAZY) @JoinColumn(name = "item_id")
private List <Item> items;
}
