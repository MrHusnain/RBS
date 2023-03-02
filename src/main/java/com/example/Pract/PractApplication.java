package com.example.Pract;

import com.example.Pract.Model.Customer;
import com.example.Pract.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PractApplication.class, args);
	}
@Autowired
CustomerRepository customerRepository;
	@Override
	public void run(String... args) throws Exception {
// first customer just for check
		Customer custumer1=new Customer();
		custumer1.setCustomer_Name("Ali Khan");
		customerRepository.save(custumer1);
// second customer
		Customer customer2=new Customer();
		customer2.setCustomer_Name("Afzaal ");
		customerRepository.save(customer2);
// third customer
        Customer customer3=new Customer();
		customer3.setCustomer_Name("Sir Ateeb");
		customerRepository.save(customer3);


	}
}
