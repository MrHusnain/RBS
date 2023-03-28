package com.example.Pract.Controller;

import com.example.Pract.Entity.Customer;
import com.example.Pract.Model.customerModel;
import com.example.Pract.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping
    public void addCustomer(@RequestBody customerModel customermodel ){
        customerService.AddCustomer(customermodel);
    }
    @GetMapping
    public List<customerModel> GetAllCustomers(){
    return customerService.GetAllCustomer();
    }
}
