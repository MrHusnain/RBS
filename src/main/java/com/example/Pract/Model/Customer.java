package com.example.Pract.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Customer")
public class Customer {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
@Column(name="customerName")
    private String Customer_Name;
@Column
private Double Customer_order;
@Column
private Double Customer_TotalOrder;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Customer_Name='" + Customer_Name + '\'' +
                ", Customer_order=" + Customer_order +
                ", Customer_TotalOrder=" + Customer_TotalOrder +
                '}';
    }

}
