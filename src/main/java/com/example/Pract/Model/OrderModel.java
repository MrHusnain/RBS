//package com.example.Pract.Model;
//
//import com.example.Pract.Entity.Item;
//import com.example.Pract.Entity.Order;
//import jakarta.persistence.Column;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Data @AllArgsConstructor @NoArgsConstructor @Builder @Component
//public class OrderModel {
//    private Long orderId;
//    private  String orderNbr;
//    private List <ItemModel> itemModelList;
//    private List<OrderLineitemModel> orderLineitemModelList;
//
//    public Order dissamble() {
//        Order order=new Order();
//        order.setOrderId(this.orderId);
//        order.setOrderNbr(this.orderNbr);
//
//
//
//        return order;
//    }
//    public OrderModel assemble(Order order){
//        OrderModel orderModel=new OrderModel();
//        orderModel.setOrderId(order.getOrderId());
//        orderModel.setOrderNbr(order.getOrderNbr());
//        return orderModel;
//    }
//}
