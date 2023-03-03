package com.example.Pract.Services;

import com.example.Pract.Repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServices {
    @Autowired
    OrderDetailRepository orderDetailRepository;
}
