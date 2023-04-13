package com.example.Pract.Model;
import com.example.Pract.Entity.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor
public class CustomerModel {
    private int customerId;
    private String name;
    private String email;
    public Customer dissamble(){
        Customer customer=new Customer();
        customer.setId(this.customerId);
        customer.setName((this.name));
        customer.setEmail(this.email);
        return customer;
    }
    public CustomerModel assamble(Customer customer){
        CustomerModel customerModel=new CustomerModel();
        customerModel.setCustomerId(customer.getId());
        customerModel.setName(customer.getName());
        customerModel.setEmail(customer.getEmail());

        return customerModel;
    }
}
