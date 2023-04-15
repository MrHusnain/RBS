package com.example.Pract;

import com.example.Pract.Entity.User;
import com.example.Pract.Repository.UserRepositry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest @AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback (value = false)
public class userRepoTest {
    @Autowired
    UserRepositry userRepositry;
    @Test
    public void testAddNew(){
        User user=new User();
        user.setUserType("admin");
        user.setUserName("Khan");
        user.setPassword("111111");
     User userSaved=   userRepositry.save(user);
        Assertions.assertNotNull(userSaved);

    }
    @Test
    public void ListAll(){
       Iterable <User> users= userRepositry.findAll();
       Assertions.assertNotNull(users);
    }
}
