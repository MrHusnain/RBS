package com.example.Pract.Model;

import com.example.Pract.Entity.User;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Component;

@Data
@Component @NoArgsConstructor
public class UserModel {
    private long UserId;
    private String UserType;
    private String UserName;


    public User dissamble(){
        User user=new User();
        user.setUserId(this.UserId);
        user.setUserName(this.UserName);
        user.setUserType(this.UserType);

    return user;
            }
    public UserModel assamble(User user){
        UserModel userModel=new UserModel();
        userModel.setUserId(user.getUserId());
        userModel.setUserType(user.getUserType());
        userModel.setUserName(user.getUserName());
    return userModel;
    }

}
