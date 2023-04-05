package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data @NoArgsConstructor
@AllArgsConstructor

public class ItemModel {
    private int id;
    private String name;
    private String price;
//    @JsonProperty("Category")
//    private CategoryModel categoryModel;

    public ItemModel(Item item){
        this.setName(item.getName());
        this.setId(item.getId());
        this.setPrice(item.getPrice());
//       this.setCategoryModel(new CategoryModel().assamble(item.getCategory()));
    }

    public Item dissamble(){
  Item item=new Item();
  item.setId(id);
  item.setName(name);
  item.setPrice(price);
//  item.setCategory(categoryModel.dissamble());
  return item;
}
public ItemModel assamble(Item item){
    ItemModel itemModel=new ItemModel();
    itemModel.setId(item.getId());
    itemModel.setName(item.getName());
    itemModel.setPrice(item.getPrice());
//   itemModel.setCategoryModel(categoryModel.assamble(item.getCategory()));
//   itemModel.setCategoryModel(new CategoryModel().assamble(item.getCategory()));
    return itemModel;
}
}
