package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Builder
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column (name = "user_type")
    private String userType;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @OneToMany (mappedBy = "user")
    private List <Bill> bills;


    }
