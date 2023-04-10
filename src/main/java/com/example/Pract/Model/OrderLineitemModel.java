package com.example.Pract.Model;
import com.example.Pract.Entity.Item;
import com.example.Pract.Entity.OrderLineItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class OrderLineitemModel {
    private long id;
    private Double price;
    private Integer qty;
    private OrderModel orderModel;
    private  List<ItemModel> items;


    public OrderLineItem dissamble() {
        OrderLineItem orderLineItem=new OrderLineItem();
        orderLineItem.setId(this.id);
        orderLineItem.setQty(this.qty);
        orderLineItem.setPrice(this.price);
        orderLineItem.setOrder(orderModel.dissamble());
        return orderLineItem;
    }
    public OrderLineitemModel assamble(OrderLineItem orderLineItem){
        OrderLineitemModel orderLineitemModel=new OrderLineitemModel();
        orderLineitemModel.setId(orderLineItem.getId());
        orderLineitemModel.setQty(orderLineItem.getQty());
        orderLineitemModel.setPrice(orderLineItem.getPrice());
        orderLineitemModel.setOrderModel(new OrderModel().assemble(orderLineItem.getOrder()));
        return orderLineitemModel;
    }
}
