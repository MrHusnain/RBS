package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component @NoArgsConstructor @AllArgsConstructor @Builder
public class UserModel {
    private long UserId;
    private String UserType;
    private String UserName;

}
