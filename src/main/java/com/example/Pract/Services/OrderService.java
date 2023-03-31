package com.example.Pract.Services;

import com.example.Pract.Entity.Order;
import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Model.OrderLineitemModel;
import com.example.Pract.Model.OrderModel;
import com.example.Pract.Repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service @RequiredArgsConstructor @Slf4j @Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void placeOrder(OrderModel orderModel){
        Order order=new Order();
        order.setOrderNbr(UUID.randomUUID().toString());
      List<OrderLineItem> orderlineitems= orderModel
              .getOrderLineitemModelList().
                stream()
                .map(this::maptoDto)
                .collect(Collectors.toList());
      order.setOrderLineItems(orderlineitems);
      orderRepository.save(order);
      log.info("Order {} {} Created successfully",order.getOrderNbr(),order.getOrderId());
    }
    private OrderLineItem maptoDto(OrderLineitemModel orderLineitemModel){
        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setTbill(orderLineitemModel.getBill());
        orderLineItem.setQty(orderLineitemModel.getQty());
        return orderLineItem;
    }
@Transactional
    public OrderModel getOrderById(String id) {
    OrderModel orderModel=new OrderModel();
    return orderModel.assemble(orderRepository.findOrderById(id));
    }
}
