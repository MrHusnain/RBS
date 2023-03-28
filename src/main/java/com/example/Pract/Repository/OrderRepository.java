package com.example.Pract.Repository;

import com.example.Pract.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order,Long> {
}
