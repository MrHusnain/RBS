package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name ="Order_Detail")
public class OrderDetail {
    @Id
    @Column(name = "order_id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long OrderId;


//    @OneToOne
//    @JoinColumn
//    CustomerSelectedOrder SelectedOrder;
@Column
private Double TotalBill;
@Column
private Double order_Time;



}
