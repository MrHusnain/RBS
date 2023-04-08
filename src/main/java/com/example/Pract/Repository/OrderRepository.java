package com.example.Pract.Repository;
import com.example.Pract.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Order findOrderByOrderId(Long orderId);

}
