package com.example.Pract.Services;

import com.example.Pract.Entity.Order;
import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Model.OrderLineitemModel;
import com.example.Pract.Model.OrderModel;
import com.example.Pract.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderServices {
    @Autowired
    OrderRepository orderRepository;
    public void placeOrder(OrderModel orderModel){
        Order order=new Order();
        order.setOrderNbr(UUID.randomUUID().toString());

      List<OrderLineItem> orderlineitems= orderModel.getOrderLineitemModelList().
                stream()
                .map(this::maptoDto)
                .collect(Collectors.toList());
      order.setOrderLineItems(orderlineitems);
    }
    private OrderLineItem maptoDto(OrderLineitemModel orderLineitemModel){
        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setPrice(orderLineitemModel.getPrice());
        orderLineItem.setQty(orderLineItem.getQty());
        orderLineItem.setSkuCode(orderLineItem.getSkuCode());
        return orderLineItem;
    }
}
