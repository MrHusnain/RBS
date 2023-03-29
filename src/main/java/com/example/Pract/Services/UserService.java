package com.example.Pract.Services;

import com.example.Pract.Entity.User;
import com.example.Pract.Model.UserModel;
import com.example.Pract.Repository.UserRepositry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@Service
public class UserService {
    @Autowired
    UserRepositry userRepositry;
    public void addUser(UserModel userModel){
        User user= User.builder().UserName(userModel.getUserName())
                .UserType(userModel.getUserType())
                .build();
        userRepositry.save(user);
        log.info("user {} saved",user.getUserId());

    }
    public List<UserModel> getAllUser(){
        return userRepositry.findAll().stream()
                .map(this::EntityToModel)
                .collect(Collectors.toList());
    }
    public UserModel EntityToModel(User user){
        UserModel userModel=new UserModel();
        userModel.setUserId(user.getUserId());
        userModel.setUserName(user.getUserName());
        userModel.setUserType(user.getUserType());
return userModel;
    }
    public boolean SearchUser(Long userId) {
        return userRepositry.existsById(userId);
    }

    public String DeleteUser(Long userId) {
        String Result;
        if (SearchUser(userId)) {
            userRepositry.deleteById(userId);
            Result="Deleted";
        }
        else {
            Result="Not exist";
        }
        return Result;
        }
}
