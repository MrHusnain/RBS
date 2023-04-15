package com.example.Pract.Controller;

import com.example.Pract.Entity.User;
import com.example.Pract.Model.UserModel;
import com.example.Pract.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
@RequestMapping("/api")
@RestController

public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user")
    public String addUser(@RequestBody UserModel userModel){
        return userService.addUser(userModel);
    }
    @GetMapping("/users")
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }
    @DeleteMapping("/{UserId}")
    public String DeleteUser(@PathVariable (name = "UserId") Long UserId){
        return userService.DeleteUser(UserId);
    }
    @PutMapping("/update")
    private String updateUser(@RequestBody UserModel userModel){
        return userService.updateUser(userModel);
    }
}
//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//       List<UserModel> userList =userService.getAllUser();
//        model.addAttribute("userList", userList);
//        return "index";
//    }
//    @GetMapping("/addnew")
//    public String addNewEmployee(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
//        return "newemployee";
//    } @PostMapping("/save")
//    public String saveEmployee(@ModelAttribute("user") UserModel userModel) {
//        userService.addUser(userModel);
//        return "redirect:/";
//    }
//    @GetMapping("/deleteUser/{id}")
//    public String deleteThroughId(@PathVariable(value = "id") long id) {
//        userService.DeleteUser(id);
//        return "redirect:/";
//
//    }


