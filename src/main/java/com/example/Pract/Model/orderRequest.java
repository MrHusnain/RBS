package com.example.Pract.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data @NoArgsConstructor @AllArgsConstructor
public class orderRequest {
    private List <ItemModel> itemModelList;

}
