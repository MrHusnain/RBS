package com.example.Pract.Controller;

import com.example.Pract.Model.Customer;
import com.example.Pract.Repository.CustomerRepository;
import com.example.Pract.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }
    @PostMapping
    public Customer createEmployee(@RequestBody Customer customer){
    return customerRepository.save(customer);

    }
}
