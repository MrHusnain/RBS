package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Builder @Table (name = "user")
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
    private String password;
//    @OneToMany (mappedBy = "user")
//    private List <Bill> bills;


    }
