package com.example.Pract.Model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @Component
public class OrderModel {
    private List<OrderLineitemModel> orderLineitemModelList;
}
