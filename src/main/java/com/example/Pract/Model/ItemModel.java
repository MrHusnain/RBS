package com.example.Pract.Model;
import com.example.Pract.Entity.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor

public class ItemModel {
    private int id;
    private String name;
    private String price;
   private CategoryModel categoryModel;

    public ItemModel(int id, String name, String price, CategoryModel categoryModel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryModel = categoryModel;
    }
    public ItemModel (Item item){
    }

    public Item dissamble(){
  Item item=new Item();
  item.setId(id);
  item.setName(name);
  item.setPrice(price);
 item.setCategory(categoryModel.dissamble());
  return item;
}
public ItemModel assamble(Item item){
    ItemModel itemModel=new ItemModel();
    itemModel.setId(item.getId());
    itemModel.setName(item.getName());
    itemModel.setPrice(item.getPrice());
  itemModel.setCategoryModel(new CategoryModel().assamble(item.getCategory()));
    return itemModel;
}
}
