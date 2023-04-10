package com.example.Pract.Repository;

import com.example.Pract.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    List<Integer> getOrderDetails(Integer productId, Integer quantity);

    Item findCategoryById(Integer id);
}
