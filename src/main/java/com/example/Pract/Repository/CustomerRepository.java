package com.example.Pract.Repository;
import com.example.Pract.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {
    public Customer findCustomerById(Integer id);
    public Customer getCustomerByEmailAndName(String email,String name);
}
