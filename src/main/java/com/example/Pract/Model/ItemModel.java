package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component @Data @Builder @AllArgsConstructor @NoArgsConstructor

public class ItemModel {
    private int itemId;
    private String itemName;
    private String itemPrice;
    private Category category;

}
