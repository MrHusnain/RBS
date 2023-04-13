package com.example.Pract.Model;

import com.example.Pract.Entity.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data @NoArgsConstructor 
public class OrderDTO {
    private String orderDescription;
    private List<ShoppingCart> cartItems;
    private String customerEmail;
    private String customerName;

    public OrderDTO(List<ShoppingCart> cartItems, String customerEmail, String customerName,String orderDescription) {
        this.cartItems = cartItems;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.orderDescription= orderDescription;
    }
}
