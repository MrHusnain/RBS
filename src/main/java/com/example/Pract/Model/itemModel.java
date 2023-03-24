package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
@Data

public class itemModel {
    private int itemId;
    private String itemName;
    private String itemPrice;
    private Category category;

}
