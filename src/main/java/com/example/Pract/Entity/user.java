package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

//import org.springframework.beans.factory.annotation.Autowired;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class user {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;
    @Column (name = "user_type")
    private String UserType;
    @Column(name = "user_name")
    private String UserName;
    @Column(name = "user_password")
    private String UserPassword;


    }
