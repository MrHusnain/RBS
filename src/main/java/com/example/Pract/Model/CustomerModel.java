package com.example.Pract.Model;

import com.example.Pract.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component @Builder
@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerModel {
    private int customerId;
    private String customerName;
    private OrderModel orderId;
    private OrderLineitemModel orderLineitemModel;
    public Customer dissamble(){
        Customer customer=new Customer();
        customer.setCustomerId(this.customerId);
        customer.setCustomerName((this.customerName));
        customer.setOrder(orderId.dissamble());
        customer.setOrderLineItem(orderLineitemModel.dissamble());
        return customer;
    }
    public CustomerModel assamble(Customer customer){
        CustomerModel customerModel=new CustomerModel();
        customerModel.setCustomerId(customer.getCustomerId());
        customerModel.setCustomerName(customer.getCustomerName());
        customerModel.setOrderId(orderId.assemble(customer.getOrder()));
        customerModel.setOrderLineitemModel(orderLineitemModel.assamble(customer.getOrderLineItem()));
        return customerModel;
    }
}
