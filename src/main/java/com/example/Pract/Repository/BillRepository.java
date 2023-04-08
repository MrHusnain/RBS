package com.example.Pract.Repository;

import com.example.Pract.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository <Bill,Long> {
}
