package com.example.Pract.Repository;

import com.example.Pract.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry  extends JpaRepository<User,Long>{
}
