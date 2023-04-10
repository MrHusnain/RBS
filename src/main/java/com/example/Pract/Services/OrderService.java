package com.example.Pract.Services;

import com.example.Pract.Entity.Item;
import com.example.Pract.Entity.Order;
import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Model.*;
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
      List<OrderLineItem> orderLineItems;
      order.setOrderLineItems(orderlineitems);
      orderRepository.save(order);
      log.info("Order {} {} Created successfully",order.getOrderNbr(),order.getOrderId());
    }
    private OrderLineItem maptoDto(OrderLineitemModel orderLineitemModel){

        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setId(orderLineitemModel.getId());
        orderLineItem.setPrice(orderLineitemModel.getPrice());
        orderLineItem.setQty(orderLineitemModel.getQty());
        return orderLineItem;
    }
    public void PlaceOrder(orderRequest itemModel){
        Order order=new Order();
        order.setOrderNbr(UUID.randomUUID().toString());
        List<Item> items= itemModel.getItemModelList().stream().map(itemModel1 -> MapDto(itemModel1)).toList();
       order.setItems(items);

orderRepository.save(order);
    }

    private Item MapDto(ItemModel itemModel1) {
        Item item= new Item();
        item.setName(itemModel1.getName());
        item.setPrice(itemModel1.getPrice());

        return item;
    }


    public OrderModel getOrderById(Long orderId) {
    OrderModel orderModel=new OrderModel();
    return orderModel.assemble(orderRepository.findOrderByOrderId(orderId));
    }
    public OrderModel entityToMod(Order order){
        OrderModel orderModel=new OrderModel();
        return orderModel.assemble(order);
    }

    public List<OrderModel> getAllOrder() {
        return orderRepository.findAll().stream()
                .map(this::entityToMod).
                collect(Collectors.toList());
    }
}
