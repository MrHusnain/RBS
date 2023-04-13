package com.example.Pract.Services;
import com.example.Pract.Entity.User;
import com.example.Pract.Model.UserModel;
import com.example.Pract.Repository.UserRepositry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@Service @Slf4j
public class UserService {
    @Autowired
    UserRepositry userRepositry;
    public String addUser(UserModel userModel){
        String result;
        User user=CheckUser(userModel.dissamble().getUserName());
        if (user!=null){
            result="user already exist";
        }
        else {
            upsert(userModel);
            result="user created";
        }
//        log.info("user {} saved",userModel.getUserId());
        return result;

    }
    public List<UserModel> getAllUser(){
        return userRepositry.findAll().stream()
                .map(this::EntityToModel)
                .collect(Collectors.toList());
    }
    public UserModel EntityToModel(User user){
        UserModel userModel=new UserModel();
//        userModel.assamble(user);
//        userModel.setUserId(user.getUserId());
//        userModel.setUserName(user.getUserName());
//        userModel.setUserType(user.getUserType());
return userModel.assamble(user);
    }
    public boolean SearchUser(Long userId) {
        return userRepositry.existsById(userId);
    }
    public User CheckUser(String userName) {
        return userRepositry.findByUserName(userName);
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

    public String updateUser(UserModel userModel) {
        String result;
        if (SearchUser(userModel.dissamble().getUserId())){
            upsert(userModel);
            result="Updated";
        }
        else {
            result="user not exist";
        }
        return result;
    }
    @Transactional
    public UserModel upsert(UserModel userModel){
        User user=userModel.dissamble();
        User savedUser=userRepositry.save(user);
        return new UserModel().assamble(savedUser);
    }


}
