package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ResponseOrderDTO {
    private float amount;
    private int invoiceNumber;
    private String date;
    private int orderId;
}
