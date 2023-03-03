package com.example.Pract;

import com.example.Pract.Entity.*;
import com.example.Pract.Repository.*;
import org.apache.catalina.User;
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


	OrderDetailRepository OrderRepository;

	@Override
	public void run(String... args) throws Exception {
		OrderDetail orderDetail =new OrderDetail();
		orderDetail.setCustomerName("Contour Family");
		OrderRepository.save(orderDetail);



	}
}
