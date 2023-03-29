package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor @Component
public class OrderLineitemModel {
    private long id;
    private BigDecimal price;
    private Integer qty;
}
