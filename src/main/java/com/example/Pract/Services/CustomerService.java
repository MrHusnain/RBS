package com.example.Pract.Services;

import com.example.Pract.Entity.Customer;
import com.example.Pract.Model.CustomerModel;
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

    public List<CustomerModel> GetAllCustomer() {
        return customerRepository.findAll().
                stream()
                .map(this::customerList)
                .collect(Collectors.toList());
    }

    public void AddCustomer(CustomerModel customerModel){
        Customer customer= Customer.builder()
                        .CustomerName(customerModel.getCustomerName())
                         .build();
        customerRepository.save(customer);
        log.info("customer {} Added",customer.getCustomerId());

    } private CustomerModel customerList(Customer customer){
        CustomerModel customerModel=new CustomerModel();
        customerModel.setCustomerId(customer.getCustomerId());
        customerModel.setCustomerName(customer.getCustomerName());
        return customerModel;
    }
        }
