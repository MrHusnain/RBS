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
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long OrderId;
//@Column(name="customerName")
//    private String CustomerName;
//    @Embedded
//    @Autowired
//        @Column
//    Customer customer;
@Column
private Double CustomerOrderItem;
@Column
private Double CustomerTotalBill;
@Column
private Double order_Time;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "OrderId=" + OrderId +

                ", CustomerOrderItem=" + CustomerOrderItem +
                ", CustomerTotalBill=" + CustomerTotalBill +
                ", order_Time=" + order_Time +
                '}';
    }

}
