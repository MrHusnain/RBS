package com.example.Pract.Repository;

import com.example.Pract.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry  extends JpaRepository<User,Long>{
    User findByUserId(long userId);
    User findByUserName(String userName);
}
