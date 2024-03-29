package com.example.Pract.Repository;

import com.example.Pract.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Item findItemById(Integer id);
}
