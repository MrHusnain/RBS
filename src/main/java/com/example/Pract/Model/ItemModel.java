package com.example.Pract.Model;

import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
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
    private CategoryModel categoryId;
public Item dissamble(){
    Item item=new Item();
    item.setItemId(this.itemId);
    item.setItemName(this.itemName);
    item.setItemPrice(this.itemPrice);
    item.setCategory(categoryId.dissamble());
  return item;
}
public ItemModel assamble(Item item){
    ItemModel itemModel=new ItemModel();
    itemModel.setItemId(item.getItemId());
    itemModel.setItemName(item.getItemName());
    itemModel.setItemPrice(item.getItemPrice());
    itemModel.setCategoryId(categoryId.assamble(item.getCategory()));
    return itemModel;
}
}
