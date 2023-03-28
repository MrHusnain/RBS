package com.example.Pract.Services;

import com.example.Pract.Entity.Customer;
import com.example.Pract.Model.customerModel;
import com.example.Pract.Repository.CategoryRepository;
import com.example.Pract.Repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<customerModel> GetAllCustomer() {
        return customerRepository.findAll().
                stream()
                .map(this::customerList)
                .collect(Collectors.toList());
    }

    public void AddCustomer(customerModel customerModel){
        Customer customer= Customer.builder()
                        .CustomerName(customerModel.getCustomerName())
                         .build();
        customerRepository.save(customer);
        log.info("customer {} Added",customer.getCustomerId());

    } private customerModel customerList(Customer customer){
        customerModel customerModel=new customerModel();
        customerModel.setCustomerId(customer.getCustomerId());
        customerModel.setCustomerName(customer.getCustomerName());
        return customerModel;
    }
        }
