package com.example.Pract;

//import com.example.Pract.Entity.*;
//import com.example.Pract.Repository.*;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import com.example.Pract.Entity.user;
import com.example.Pract.Repository.CategoryRepository;
import com.example.Pract.Repository.ItemRepository;
import com.example.Pract.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


@SpringBootApplication
public class PractApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PractApplication.class, args);
	}
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	CategoryRepository categoryRepository;
@Autowired
	UserRepositry userRepositry;


	@Override
	public void run(String... args) throws Exception {
		user user=new user();
		user.setUserName("Ali");
		user.setUserType("Cashier");
		userRepositry.save(user);

	}
}
