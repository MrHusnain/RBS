package com.example.Pract.Repository;

import com.example.Pract.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
