package com.example.Pract.Controller;

import com.example.Pract.Model.CustomerModel;
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
    public void addCustomer(@RequestBody CustomerModel customermodel ){
        customerService.AddCustomer(customermodel);
    }
    @GetMapping
    public List<CustomerModel> GetAllCustomers(){
    return customerService.GetAllCustomer();
    }
}
