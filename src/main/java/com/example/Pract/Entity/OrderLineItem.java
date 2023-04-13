//package com.example.Pract.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@Entity @Data @AllArgsConstructor @NoArgsConstructor @Table(name = "t_order_line_item")
//public class OrderLineItem {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "id")
//    private long id;
//    @Column (name = "price")
//    private Double price;
//    @Column (name = "qty")
//    private Integer qty;
//    @OneToMany (fetch = FetchType.LAZY)
//    @JoinColumn (name = "item_id")
//    private Item item;
////    @OneToMany (mappedBy = "orderLineItem") @JoinColumn
////    private List<Item> items;
//    @ManyToOne  (fetch = FetchType.LAZY) @JoinColumn(name = "order_id")
//    private Order order;
//
//}
