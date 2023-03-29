package com.example.Pract.Controller;

import com.example.Pract.Model.UserModel;
import com.example.Pract.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public void addUser(@RequestBody UserModel userModel){
    userService.addUser(userModel);
    }
    @GetMapping
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }
    @DeleteMapping("/{UserId}")
    public String DeleteUser(@PathVariable (name = "UserId") Long UserId){
        return userService.DeleteUser(UserId);
    }
}
