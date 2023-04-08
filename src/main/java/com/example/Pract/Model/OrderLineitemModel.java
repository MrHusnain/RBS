package com.example.Pract.Model;

import com.example.Pract.Entity.OrderLineItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor @Component
public class OrderLineitemModel {
    private long id;
    private BigDecimal bill;
    private Integer qty;
    private OrderModel orderModel;

    public OrderLineItem dissamble() {
        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setId(this.id);
        orderLineItem.setQty(this.qty);
        orderLineItem.setTbill(this.bill);
        orderLineItem.setOrder(orderModel.dissamble());
        return orderLineItem;
    }
    public OrderLineitemModel assamble(OrderLineItem orderLineItem){
        OrderLineitemModel orderLineitemModel=new OrderLineitemModel();
        orderLineitemModel.setId(orderLineItem.getId());
        orderLineitemModel.setQty(orderLineItem.getQty());
        orderLineitemModel.setBill(orderLineItem.getTbill());
        orderLineitemModel.setOrderModel(orderModel.assemble(orderLineItem.getOrder()));
        return orderLineitemModel;
    }
}
