package com.example.Pract.Model;

import com.example.Pract.Entity.Bill;
import com.example.Pract.Entity.Customer;
import com.example.Pract.Entity.OrderLineItem;
import com.example.Pract.Entity.User;
import lombok.Data;

@Data
public class BillModel {
    private Long id;
    private int totalBill;
    private OrderModel orderModel;
    private CustomerModel customerModel;
    private UserModel userModel;

    public BillModel(Long id, int totalBill, OrderModel orderModel, CustomerModel customerModel, UserModel userModel) {
        this.id = id;
        this.totalBill = totalBill;
        this.orderModel = orderModel;
        this.customerModel = customerModel;
        this.userModel = userModel;
    }

    public BillModel() {

    }
    public Bill disamble (){
        Bill bill=new Bill();
        bill.setId(id);
        bill.setCustomer(customerModel.dissamble());
        bill.setOrder(orderModel.dissamble());
        return bill;

    }
    public BillModel assamble(Bill bill){
        BillModel billModel=new BillModel();
        billModel.setId(billModel.getId());
        billModel.setCustomerModel(new CustomerModel().assamble(bill.getCustomer()));
        billModel.setOrderModel(new OrderModel().assemble(bill.getOrder()));
        billModel.setUserModel(new UserModel().assamble(bill.getUser()));
        return billModel;
    }
}
