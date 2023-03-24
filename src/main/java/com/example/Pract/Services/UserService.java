package com.example.Pract.Services;

import com.example.Pract.Entity.user;
import com.example.Pract.Model.userModel;
import com.example.Pract.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepositry userRepositry;
    public List<userModel> getAllUser(){
        return userRepositry.findAll().stream()
                .map(this::EntityToModel)
                .collect(Collectors.toList());
    }
    public userModel EntityToModel(user user){
        userModel userModel=new userModel();
        userModel.setUserId(user.getUserId());
        userModel.setUserName(user.getUserName());
        userModel.setUserType(user.getUserType());
return userModel;
    }
}
