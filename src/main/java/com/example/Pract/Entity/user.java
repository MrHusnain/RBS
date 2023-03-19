package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

//import org.springframework.beans.factory.annotation.Autowired;
@Data
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long UserId;
    @Column (name = "user_type")
    private String UserType;
    @Column(name = "user_name")
    private String UserName;
    @Column(name = "user_password")
    private String UserPassword;


    }
