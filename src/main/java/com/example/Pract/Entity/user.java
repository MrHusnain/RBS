package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;

@Entity @Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long User_id;
    @Column (name = "user_type")
    private String UserType;
    @Column(name = "user_name")
    private String UserName;
    @Column(name = "user_password")
    private String UserPassword;

    @Override
    public String toString() {
        return "user{" +
                "User_id=" + User_id +
                ", UserType='" + UserType + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                '}';
    }
}
