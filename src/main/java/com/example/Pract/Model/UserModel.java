package com.example.Pract.Model;

import com.example.Pract.Entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Data
@Component @NoArgsConstructor
public class UserModel {
//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;
    private long UserId;
    private String UserType;
    private String UserName;
    private String password;
    public User dissamble(){
        User user=new User();
        user.setUserId(this.UserId);
        user.setUserName(this.UserName);
        user.setUserType(this.UserType);
    user.setPassword(this.password);
//    user.setPassword(bCryptPasswordEncoder.encode(this.password));

    return user;
            }
    public UserModel assamble(User user){
        UserModel userModel=new UserModel();
        userModel.setUserId(user.getUserId());
        userModel.setUserType(user.getUserType());
        userModel.setUserName(user.getUserName());
  userModel.setPassword(user.getPassword());
//     userModel.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    return userModel;
    }

}
