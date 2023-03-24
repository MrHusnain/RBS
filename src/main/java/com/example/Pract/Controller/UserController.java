package com.example.Pract.Controller;

import com.example.Pract.Model.userModel;
import com.example.Pract.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/Users")
    public List<userModel> getAllUser(){
        return userService.getAllUser();
    }

}
