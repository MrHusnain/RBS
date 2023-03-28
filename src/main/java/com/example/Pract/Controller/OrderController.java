package com.example.Pract.Controller;


import com.example.Pract.Entity.Order;
import com.example.Pract.Model.OrderModel;
import com.example.Pract.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderDetail")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @PostMapping
    public String createOrder(@RequestBody OrderModel orderModel){
        return "Order Created Successfully";
    }
    @GetMapping
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }
}
