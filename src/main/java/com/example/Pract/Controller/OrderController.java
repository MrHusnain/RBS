package com.example.Pract.Controller;
import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Model.CategoryModel;
import com.example.Pract.Model.OrderLineitemModel;
import com.example.Pract.Model.OrderModel;
import com.example.Pract.Services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequiredArgsConstructor
@RequestMapping("/api/orderDetail")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody OrderModel orderModel) {
        orderService.placeOrder(orderModel);
        return "Order Created Successfully";
    }
    @GetMapping("/{orderId}")
    private OrderModel getClientById(@PathVariable(name = "orderId")Long orderId){
        return orderService.getOrderById(orderId);
    }
    @GetMapping
    public List<OrderModel> AllOrder()
    {
        return orderService.getAllOrder();
    }

}
