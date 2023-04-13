package com.example.Pract.Services;
import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import com.example.Pract.Entity.Order;
//import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Entity.ShoppingCart;
import com.example.Pract.Model.*;
import com.example.Pract.Repository.ItemRepository;
import com.example.Pract.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
@Service @RequiredArgsConstructor @Slf4j @Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ItemRepository itemRepository;
    public Order getOrderById(int orderId) {
    return orderRepository.findOrderById(orderId);
    }
//    public OrderModel entityToMod(Order order){
//        OrderModel orderModel=new OrderModel();
//        return orderModel.assemble(order);
//    }

//   public List<OrderModel> getAllOrder() {
//        return orderRepository.findAll().stream()
//                .map(this::entityToMod).
//                collect(Collectors.toList());
//    }
public Boolean searchOrder(Integer orderid){
    return orderRepository.existsById(orderid);
}

    public List<Order> gelAllOrder(){
        return orderRepository.findAll();
    }
    public float getCartAmount(List<ShoppingCart> shoppingCartList) {
        float totalCartAmount = 0f;
        float singleCartAmount = 0f;
        for (ShoppingCart cart : shoppingCartList) {
            int itemId = cart.getProductId();
            Optional<Item> item = itemRepository.findById(itemId);
            if (item.isPresent()) {
                Item item1 = item.get();
                Category category=new Category();
                singleCartAmount = cart.getQuantity() * item1.getPrice();
                totalCartAmount = totalCartAmount + singleCartAmount;
                cart.setProductName(item1.getName());
                cart.setAmount(singleCartAmount);
//                cart.setCategroyId(category.getId());
                itemRepository.save(item1);
            }
        }
        return totalCartAmount;}
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderDetail(int orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order.isPresent() ? order.get() : null;
    }

    public String updateOrder(Order order) {
        String result;
        if (searchOrder(order.getId())){
            updateOrder(order);
            result="order update";
            return result;
        }else {
            result="order not exist";
            return result;
        }
    }
}
