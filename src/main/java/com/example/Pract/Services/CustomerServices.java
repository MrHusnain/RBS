package com.example.Pract.Services;

import com.example.Pract.Model.Customer;
import com.example.Pract.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepository customerRepository;
}
