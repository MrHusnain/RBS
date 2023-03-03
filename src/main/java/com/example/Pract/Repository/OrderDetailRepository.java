package com.example.Pract.Repository;

import com.example.Pract.Entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
