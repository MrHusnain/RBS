package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor
public class OrderLineitemModel {
    private long id;
    private BigDecimal price;
    private Integer qty;
}
