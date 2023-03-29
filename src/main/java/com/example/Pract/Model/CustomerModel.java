package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component @Builder
@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerModel {
    private int customerId;
    private String CustomerName;

}
