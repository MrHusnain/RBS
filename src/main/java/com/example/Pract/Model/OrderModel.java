package com.example.Pract.Model;

import com.example.Pract.Entity.Order;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @Component
public class OrderModel {
    private String OrderId;
    private  String OrderNbr;

    private List<OrderLineitemModel> orderLineitemModelList;

    public Order dissamble() {
        Order order=new Order();
        order.setOrderId(this.OrderId);
        order.setOrderNbr(this.OrderNbr);
        return order;
    }
    public OrderModel assemble(Order order){
        OrderModel orderModel=new OrderModel();
        orderModel.setOrderId(order.getOrderId());
        orderModel.setOrderNbr(order.getOrderNbr());
        return orderModel;
    }
}
