package com.example.Pract.Repository;

import com.example.Pract.Entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository <ShoppingCart,Integer> {
}
